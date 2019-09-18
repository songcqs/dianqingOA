package com.f.dianqingoa.testcase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.a.publish.base.DriverBase;
import com.b.publish.util.ReadProperties;
import com.c.dianqingoa.element.DQWayOfMgtPopEle;
import com.c.dianqingoa.element.HompageEle;
import com.e.dianqingoa.business.DQWayOfMgtPopBus;
import com.e.dianqingoa.business.HomepageBus;
import com.e.dianqingoa.business.OfficialWebsitePageBus;
import com.f.muke.testcase.CaseBase;

public class Test020_WinSidebar_DianqingMISInformationCommunication_Experience extends CaseBase {

	public DriverBase driverBase;
	public ReadProperties properties;
	public OfficialWebsitePageBus officialWebsitePageBus;
	public HompageEle hompageEle;
	public HomepageBus homepageBus;
	public DQWayOfMgtPopEle dQWayOfMgtPopEle;
	public DQWayOfMgtPopBus dQWayOfMgtPopBus;

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
		dQWayOfMgtPopEle = new DQWayOfMgtPopEle(driverBase);
		dQWayOfMgtPopBus = new DQWayOfMgtPopBus(driverBase);
	}

	/*
	 * 18.点击"点睛管理之道"
	 */
	@Test(priority = 20,description="验证：点击\"点睛管理之道\"")
	public void dianqings_Way_of_Management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickDianqings_Way_of_Management();

		driverBase.switchToParentFrame();
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_MIS_Information_Communication());
		assertEquals(str, "点晴MIS信息通（IM）", "没找到'点晴MIS信息通（IM）'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.1鼠标悬停"点晴MIS信息通（IM）"
	 */
	@Test(priority = 20,description="验证：悬停\"点晴MIS信息通（IM）\"", dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_MIS_Information_Communication() {
		
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_MIS_Information_Communication();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_MIS_Information_Communication());
		assertEquals(str, "点晴MIS信息通（IM）", "没找到'点晴MIS信息通（IM）'!");
		driverBase.switchToParentFrame();
	}
	
	/*
	 * 18.1.6点击"点晴MIS信息通（IM）"页"立即体验"
	 */
	@Test(priority = 20,description="验证：点击\"点晴MIS信息通（IM）\"页\"立即体验\"", dependsOnMethods = "winLeft_MIS_Information_Communication")
//	@Test(priority = 20)
	public void winMain_Experience_Start1() {
		
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start1();

		driverBase.switchToCurrentPage();

		String str = driverBase.getURL();

		assertEquals(str, "http://im.clicksun.cn/im/download.htm", "页面跳转失败!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
