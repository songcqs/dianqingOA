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

public class Test016_Sidebar_PersonalMemorandum extends CaseBase {

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
	 * 15.点击"党员天地"
	 */
	@Test(priority = 16,description="验证：展开'党员天地'")
	public void party_members_world() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickparty_members_world();
		String openness_of_Party_Affairs_Information = driverBase
				.getText(hompageEle.getopenness_of_Party_Affairs_Information());
		assertEquals(openness_of_Party_Affairs_Information, "党务信息公开", "没找到'党务信息公开'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 15.1点击"党务信息公开"链接
	 */
	@Test(priority = 16,description="验证：点击'党务信息公开'", dependsOnMethods = "party_members_world")
	public void openness_of_Party_Affairs_InformationLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickopenness_of_Party_Affairs_InformationLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainOpenness_of_Party_Affairs();
		String str = driverBase.getText(ele);

		assertEquals(str, "党务公开", "没找到'党务公开'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 15.2点击"党员信息介绍"链接
	 */
	@Test(priority = 16,description="验证：点击'党员信息介绍'", dependsOnMethods = "party_members_world")
	public void information_Introduction_of_Party_MembersLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickinformation_Introduction_of_Party_MembersLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getParty_Member_Information();
		String str = driverBase.getText(ele);

		assertEquals(str, "党员信息", "没找到'党员信息'!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
