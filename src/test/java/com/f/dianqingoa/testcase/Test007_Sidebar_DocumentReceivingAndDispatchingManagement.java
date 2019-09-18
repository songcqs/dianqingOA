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

public class Test007_Sidebar_DocumentReceivingAndDispatchingManagement extends CaseBase {

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
	 * 6.点击"公文收发管理"
	 */
	@Test(priority = 7,description="验证：展开'公文收发管理'")
	public void document_Receiving_and_Dispatching_Management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickdocument_Receiving_and_Dispatching_Management();
		String draft_manuscript = driverBase.getText(hompageEle.getdraft_manuscriptg());
		assertEquals(draft_manuscript, "发文拟稿", "没找到'发文拟稿'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 6.1点击"发文拟稿"链接
	 */
	@Test(priority = 7,description="验证：点击'发文拟稿'",dependsOnMethods = "document_Receiving_and_Dispatching_Management")
	public void draft_manuscriptgLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickdraft_manuscriptgLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement drafting_of_Official_DocumentsEle = hompageEle.getDrafting_of_Official_Documents();
		String drafting_of_Official_DocumentsStr = driverBase.getText(drafting_of_Official_DocumentsEle);

		assertEquals(drafting_of_Official_DocumentsStr, "公文拟稿", "没找到'公文拟稿'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 6.2点击"收发文审核"链接
	 */
	@Test(priority = 7,description="验证：点击'收发文审核'",dependsOnMethods = "document_Receiving_and_Dispatching_Management")
	public void audit_of_Receiving_and_Sending_DocumentsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickaudit_of_Receiving_and_Sending_DocumentsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement mainAudit_of_Receiving_and_Sending_DocumentsEle = hompageEle
				.getmainAudit_of_Receiving_and_Sending_Documents();
		String mainAudit_of_Receiving_and_Sending_DocumentsStr = driverBase
				.getText(mainAudit_of_Receiving_and_Sending_DocumentsEle);

		assertEquals(mainAudit_of_Receiving_and_Sending_DocumentsStr, "收发文审核", "没找到'收发文审核'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 6.3点击"我的拟稿"链接
	 */
	@Test(priority = 7,description="验证：点击'我的拟稿'",dependsOnMethods = "document_Receiving_and_Dispatching_Management")
	public void my_draftLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickmy_draftLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement mainMy_DraftEle = hompageEle.getmainMy_Draft();
		String mainMy_DraftStr = driverBase.getText(mainMy_DraftEle);

		assertEquals(mainMy_DraftStr, "我的拟稿", "没找到'我的拟稿'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 6.4点击"收文拟办"链接
	 */
	@Test(priority = 7,description="验证：点击'收文拟办'",dependsOnMethods = "document_Receiving_and_Dispatching_Management")
	public void receiving_Papers_to_be_ProcessedLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickreceiving_Papers_to_be_ProcessedLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement to_be_accepted_by_meEle = hompageEle.getTo_be_accepted_by_me();
		String to_be_accepted_by_meStr = driverBase.getText(to_be_accepted_by_meEle);

		assertEquals(to_be_accepted_by_meStr, "待我接收", "没找到'待我接收'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 6.5点击"收文承办"链接
	 */
	@Test(priority = 7,description="验证：点击'收文承办'",dependsOnMethods = "document_Receiving_and_Dispatching_Management")
	public void acceptanceLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickacceptanceLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement mainAcceptanceEle = hompageEle.getmainAcceptance();
		String mainAcceptanceStr = driverBase.getText(mainAcceptanceEle);

		assertEquals(mainAcceptanceStr, "收文承办", "没找到'收文承办'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 6.6点击"公文督办"链接
	 */
	@Test(priority = 7,description="验证：点击'公文督办'",dependsOnMethods = "document_Receiving_and_Dispatching_Management")
	public void document_Supervisory_OfficeLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickdocument_Supervisory_OfficeLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement supervisory_Office_of_DocumentsEle = hompageEle.getSupervisory_Office_of_Documents();
		String supervisory_Office_of_DocumentsStr = driverBase.getText(supervisory_Office_of_DocumentsEle);

		assertEquals(supervisory_Office_of_DocumentsStr, "公文督办", "没找到'公文督办'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 6.7点击"查看公文"链接
	 */
	@Test(priority = 7,description="验证：点击'查看公文'",dependsOnMethods = "document_Receiving_and_Dispatching_Management")
	public void view_official_documentsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickview_official_documentsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement viewing_Official_DocumentsEle = hompageEle.getViewing_Official_Documents();
		String viewing_Official_DocumentsStr = driverBase.getText(viewing_Official_DocumentsEle);

		assertEquals(viewing_Official_DocumentsStr, "查看公文", "没找到'查看公文'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 6.8点击"基础信息设置"链接
	 */
	@Test(priority = 7,description="验证：点击'基础信息设置'",dependsOnMethods = "document_Receiving_and_Dispatching_Management")
	public void document_basic_Information_SettingsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickdocument_basic_Information_SettingsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement document_Category_ManagementEle = hompageEle.getDocument_Category_Management();
		String document_Category_ManagementStr = driverBase.getText(document_Category_ManagementEle);

		assertEquals(document_Category_ManagementStr, "公文类别管理", "没找到'公文类别管理'!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
