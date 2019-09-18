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

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class Test004_Sidebar_NotificationAndAnnouncementManagemen extends CaseBase {

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
	 * 3.点击展开"通知公告管理"
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("展开'通知公告管理'")
//	@Title("通知公告管理")
	@Test(priority = 4,description="验证：展开'通知公告管理'")
	public void notification_and_Announcement_Management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clicknotification_and_Announcement_Management();
		String announcement_of_Notification = driverBase.getText(hompageEle.getannouncement_of_Notification());
		assertEquals(announcement_of_Notification, "发布通知公告", "没找到'发布通知公告'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 3.1点击"发布通知公告"
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'发布通知公告'")
//	@Title("发布通知公告")
	@Test(priority = 4, dependsOnMethods = "notification_and_Announcement_Management",description="验证：点击'发布通知公告'")
	public void announcement_of_Notification() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickannouncement_of_NotificationLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement publication_of_new_documents_or_noticesEle = hompageEle.getPublication_of_new_documents_or_notices();
		String publication_of_new_documents_or_noticesStr = driverBase
				.getText(publication_of_new_documents_or_noticesEle);

		driverBase.sleep(1000);
		assertEquals(publication_of_new_documents_or_noticesStr, "发布新公文/通知", "没找到'发布新公文/通知'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 3.2点击"浏览通知公告"
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'浏览通知公告'")
//	@Title("浏览通知公告")
	@Test(priority = 4, dependsOnMethods = "notification_and_Announcement_Management",description="验证：点击'浏览通知公告'")
	public void browse_Notice_Bulletin() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_Notice_BulletinLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement browse_documents_or_noticesEle = hompageEle.getBrowse_documents_or_notices();
		String browse_documents_or_noticesStr = driverBase.getText(browse_documents_or_noticesEle);

		driverBase.sleep(1000);
		assertEquals(browse_documents_or_noticesStr, "浏览公文/通知", "没找到'浏览公文/通知'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 3.3点击"签收记录管理"
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'签收记录管理'")
//	@Title("签收记录管理")
	@Test(priority = 4, dependsOnMethods = "notification_and_Announcement_Management",description="验证：点击'签收记录管理'")
	public void management_of_Sign_and_Receive_Records() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickmanagement_of_Sign_and_Receive_RecordsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement management_of_Sign_and_Receive_RecordsEle = hompageEle.getManagement_of_Sign_and_Receive_Records();
		String management_of_Sign_and_Receive_RecordsStr = driverBase
				.getText(management_of_Sign_and_Receive_RecordsEle);

		driverBase.sleep(1000);
		assertEquals(management_of_Sign_and_Receive_RecordsStr, "签收记录管理", "没找到'签收记录管理'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 3.4点击"基础信息设置"
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'基础信息设置'")
//	@Title("基础信息设置")
	@Test(priority = 4, dependsOnMethods = "notification_and_Announcement_Management",description="验证：点击'基础信息设置'")
	public void notice_basic_Information_Settings() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clicknotice_basic_Information_SettingsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement global_Information_MaintenanceEle = hompageEle.getGlobal_Information_Maintenance();
		String global_Information_MaintenanceStr = driverBase.getText(global_Information_MaintenanceEle);

		driverBase.sleep(1000);
		assertEquals(global_Information_MaintenanceStr, "全局信息维护", "没找到'全局信息维护'!");
		driverBase.switchToParentFrame();
	}

	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
