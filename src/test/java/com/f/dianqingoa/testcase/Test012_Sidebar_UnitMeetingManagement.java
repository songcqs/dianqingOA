package com.f.dianqingoa.testcase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.a.publish.base.DriverBase;
import com.b.publish.util.ReadProperties;
import com.c.dianqingoa.element.HompageEle;
import com.e.dianqingoa.business.HomepageBus;
import com.e.dianqingoa.business.OfficialWebsitePageBus;
import com.f.muke.testcase.CaseBase;

public class Test012_Sidebar_UnitMeetingManagement extends CaseBase {

	public DriverBase driverBase;
	public ReadProperties properties;
	public OfficialWebsitePageBus officialWebsitePageBus;
	public HompageEle hompageEle;
	public HomepageBus homepageBus;

	@BeforeClass
	public void beforeClass() {

		this.driverBase = initDriverBase("chrome");
		properties = new ReadProperties("dianqingoa.properties");
		// 设置系统响应时间为10秒钟
		driverBase.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverBase.get(properties.getProperties("url"));
		driverBase.maxBrowser();
		driverBase.waitUntilPageContainText("在线体验");// 等待页面加载出"在线体验"
		officialWebsitePageBus = new OfficialWebsitePageBus(driverBase);

		hompageEle = new HompageEle(driverBase);
		homepageBus = new HomepageBus(driverBase);
		officialWebsitePageBus.clickOnlineExperience();
		driverBase.switchToCurrentWindow();
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
	}

	/*
	 * 11.点击"单位会议管理"
	 */
	@Test(priority = 12,description="验证：展开'单位会议管理'")
	public void unit_Meeting_Management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickunit_Meeting_Management();
		String unit_Meeting_Management = driverBase.getText(hompageEle.getunit_Meeting_Management());
		assertEquals(unit_Meeting_Management, "单位会议管理", "没找到'单位会议管理'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 11.1点击"发布会议通知"链接
	 */
	@Test(priority = 12,description="验证：点击'发布会议通知'", dependsOnMethods = "unit_Meeting_Management")
	public void press_conference_announcementLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickpress_conference_announcementLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getAnnouncement_of_Conference();
		String str = driverBase.getText(ele);

		assertEquals(str, "发布会议通知", "没找到'发布会议通知'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 11.2点击"新增会议纪要"链接
	 */
	@Test(priority = 12,description="验证：点击'新增会议纪要'", dependsOnMethods = "unit_Meeting_Management")
	public void added_minutes_of_the_meetingLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickadded_minutes_of_the_meetingLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getSummary_of_Additional_Meetings();
		String str = driverBase.getText(ele);

		assertEquals(str, "新增会议纪要", "没找到'新增会议纪要'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 11.3点击"浏览会议纪要"链接
	 */
	@Test(priority = 12,description="验证：点击'浏览会议纪要'", dependsOnMethods = "unit_Meeting_Management")
	public void browse_the_minutes_of_the_meetingLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_the_minutes_of_the_meetingLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getBrowse_Conference_Summary();
		String str = driverBase.getText(ele);

		assertEquals(str, "浏览会议纪要", "没找到'浏览会议纪要'!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
