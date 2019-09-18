package com.f.dianqingoa.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class Test003_Sidebar extends CaseBase {

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
	}

	/*
	 * 1.点击"工作日志管理"
	 */
//	@Test(dependsOnMethods="com.f.dianqingoa.testcase.Test001_OnlineExperience.onlineExperience")
	@Test(priority = 1,description="验证：点击'工作日志管理'下拉展开按钮")
	public void workLogManagemen() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickWorkLogManagement();

		WebElement myJobLogEle = hompageEle.getMyJobLog();
//		System.out.println("元素属性：-----------------------"+myJobLogEle.getAttribute("style"));//为空
//		assertEquals(myJobLogEle.getAttribute("style"), "", "没找到'我的工作日志'!");
		String myJobLogStr = driverBase.getText(myJobLogEle);

		assertEquals(myJobLogStr, "我的工作日志", "没找到'我的工作日志'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 1.1点击"我的工作日志"
	 */
	@Test(priority = 1, dependsOnMethods = "workLogManagemen",description="验证：点击'工作日志管理'下的'我的工作日志'")
	public void my_Job_LogEle() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickMyJobLogLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement my_Job_LogEle = hompageEle.getMy_Job_Log();
		String my_Job_LogStr = driverBase.getText(my_Job_LogEle);

		assertEquals(my_Job_LogStr, "我的工作日志(2019年8月)", "没找到'我的工作日志(2019年8月)'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 1.2点击"他人工作日志"
	 */
	@Test(priority = 1, dependsOnMethods = "workLogManagemen",description="验证：点击'工作日志管理'下的'他人工作日志'")
	public void otherPeoplesWorkLog() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickOtherPeoplesWorkLogLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement subordinate_Log_ListEle = hompageEle.getSubordinate_Log_List();
		String subordinate_Log_ListStr = driverBase.getText(subordinate_Log_ListEle);

		driverBase.sleep(1000);
		assertEquals(subordinate_Log_ListStr, "下属日志列表", "没找到'下属日志列表'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 1.3点击"日志参数设置"
	 */
	@Test(priority = 1, dependsOnMethods = "workLogManagemen",description="验证：点击'工作日志管理'下的'他人工作日志'")
	public void logParameterSetting() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickLogParameterSettingLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement Working_Log_Parameter_SettingsEle = hompageEle.getWorking_Log_Parameter_Settings();
		String Working_Log_Parameter_SettingsStr = driverBase.getText(Working_Log_Parameter_SettingsEle);

		assertEquals(Working_Log_Parameter_SettingsStr, "工作日志参数设置", "工作日志参数设置'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 2.点击"工作流管理"
	 */
	@Test(priority = 2)
	public void workflow_management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickworkflow_management();
		String workflow_application = driverBase.getText(hompageEle.getworkflow_application());
		assertEquals(workflow_application, "工作流申请", "没找到'工作流申请'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 2.1点击"工作流申请"链接
	 */
	@Test(priority = 2, dependsOnMethods = "workflow_management")
	public void workflow_applicationLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickworkflow_applicationLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainWorkflow_Application();
		String str = driverBase.getText(ele);

		assertEquals(str, "工作流申请", "没找到'工作流申请'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 2.2点击"我的审批"链接
	 */
	@Test(priority = 2, dependsOnMethods = "workflow_management")
	public void my_approvalLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickmy_approvalLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
		driverBase.sleep(1000);
		WebElement ele = hompageEle.getWorkflow_to_be_audited_by_me();
		String str = driverBase.getText(ele);

		assertEquals(str, "待本人审核(/归档)工作流", "没找到'待本人审核(/归档)工作流'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 2.3点击"我的申请"链接
	 */
	@Test(priority = 2, dependsOnMethods = "workflow_management")
	public void my_applicationLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickmy_applicationLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getThe_workflow_I_applied();
		String str = driverBase.getText(ele);

		assertEquals(str, "本人申请的工作流(审核中)", "没找到'本人申请的工作流(审核中)'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 2.4点击"已办工作流"链接
	 */
	@Test(priority = 2, dependsOnMethods = "workflow_management")
	public void workflow_already_doneLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickworkflow_already_doneLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getWorkflow_List();
		String str = driverBase.getText(ele);

		assertEquals(str, "工作流列表", "没找到'工作流列表'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 2.5点击"模板管理"链接
	 */
	@Test(priority = 2, dependsOnMethods = "workflow_management")
	public void template_managementLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clicktemplate_managementLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getWorkflow_Template_Management();
		String str = driverBase.getText(ele);

		assertEquals(str, "工作流模板管理", "没找到'工作流模板管理'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 2.6点击"流程管理"链接
	 */
	@Test(priority = 2, dependsOnMethods = "workflow_management")
	public void process_managementLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickprocess_managementLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getWorkflow_Process_Management();
		String str = driverBase.getText(ele);

		assertEquals(str, "工作流流程管理", "没找到'工作流流程管理'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 2.7点击"参数设置"链接
	 */
	@Test(priority = 2, dependsOnMethods = "workflow_management")
	public void parameter_SettingsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickparameter_SettingsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getWorkflow_Parameter_Settings();
		String str = driverBase.getText(ele);

		assertEquals(str, "工作流参数设置", "没找到'工作流参数设置'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 3.点击"通知公告管理"
	 */
	@Test(priority = 3)
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
	@Test(priority = 3, dependsOnMethods = "notification_and_Announcement_Management")
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
	@Test(priority = 3, dependsOnMethods = "notification_and_Announcement_Management")
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
	@Test(priority = 3, dependsOnMethods = "notification_and_Announcement_Management")
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
	@Test(priority = 3, dependsOnMethods = "notification_and_Announcement_Management")
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

	/*
	 * 4.点击"我的通讯录"
	 */
	@Test(priority = 4)
	public void my_address_book() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickmy_address_book();
		String unit_Address_Book = driverBase.getText(hompageEle.getunit_Address_Book());
		assertEquals(unit_Address_Book, "单位通讯录", "没找到'单位通讯录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 4.1点击"单位通讯录"链接
	 */
	@Test(priority = 4, dependsOnMethods = "my_address_book")
	public void unit_Address_BookLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickunit_Address_BookLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainUnit_Address_Book();
		String str = driverBase.getText(ele);

		assertEquals(str, "单位通讯录", "没找到'单位通讯录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 4.2点击"个人通讯录"链接
	 */
	@Test(priority = 4, dependsOnMethods = "my_address_book")
	public void personal_Address_BookLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickpersonal_Address_BookLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainPerson_Address_Book();
		String str = driverBase.getText(ele);

		assertEquals(str, "个人通讯录", "没找到'个人通讯录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 4.3点击"外部通讯录"链接
	 */
	@Test(priority = 4, dependsOnMethods = "my_address_book")
	public void external_Address_BookLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickexternal_Address_BookLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainExternal_Address_Book();
		String str = driverBase.getText(ele);

		assertEquals(str, "外部通讯录", "没找到'外部通讯录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 4.4点击"个人资料维护"链接
	 */
	@Test(priority = 4, dependsOnMethods = "my_address_book")
	public void personal_Data_MaintenanceLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickpersonal_Data_MaintenanceLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getPersonnel_Data_Maintenance();
		String str = driverBase.getText(ele);

		assertEquals(str, "个人资料维护", "没找到'个人资料维护'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 5.点击"单位车辆管理"
	 */
	
	
	/*
	 * 5.1点击"车辆预约"
	 */
	

	/*
	 * 5.2点击"车辆占用情况"
	 */

	
	/*
	 * 5.3点击"用车审核管理"
	 */

	
	/*
	 * 5.4点击"车辆使用记录"
	 */

	
	/*
	 * 5.5点击"车辆信息管理"
	 */

	
	/*
	 * 5.6点击"车辆费用管理"
	 */

	
	/*
	 * 5.7点击"基础信息设置"
	 */
	

	/*
	 * 6.点击"公文收发管理"
	 */
	@Test(priority = 6)
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
	@Test(priority = 6, dependsOnMethods = "document_Receiving_and_Dispatching_Management")
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
	@Test(priority = 6, dependsOnMethods = "document_Receiving_and_Dispatching_Management")
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
	@Test(priority = 6, dependsOnMethods = "document_Receiving_and_Dispatching_Management")
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
	@Test(priority = 6, dependsOnMethods = "document_Receiving_and_Dispatching_Management")
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
	@Test(priority = 6, dependsOnMethods = "document_Receiving_and_Dispatching_Management")
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
	@Test(priority = 6, dependsOnMethods = "document_Receiving_and_Dispatching_Management")
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
	@Test(priority = 6, dependsOnMethods = "document_Receiving_and_Dispatching_Management")
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
	@Test(priority = 6, dependsOnMethods = "document_Receiving_and_Dispatching_Management")
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

	/*
	 * 7.点击"工作报告管理"
	 */
	@Test(priority = 7)
	public void work_report_management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickwork_report_management();
		String arrangement_of_work_reports = driverBase.getText(hompageEle.getarrangement_of_work_reports());
		assertEquals(arrangement_of_work_reports, "安排工作报告", "没找到'安排工作报告'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 7.1点击"安排工作报告"链接
	 */
	@Test(priority = 7, dependsOnMethods = "work_report_management")
	public void arrangement_of_work_reportsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickarrangement_of_work_reportsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getAdditional_Work_Reporting_Tasks();
		String str = driverBase.getText(ele);

		assertEquals(str, "新增工作报告任务", "没找到'新增工作报告任务'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 7.2点击"工作报告管理(跟踪)"链接
	 */
	@Test(priority = 7, dependsOnMethods = "work_report_management")
	public void work_report_trackingLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickwork_report_trackingLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainWork_Report_Tracking();
		String str = driverBase.getText(ele);

		assertEquals(str, "工作报告跟踪", "没找到'工作报告跟踪'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 8.点击"工作计划管理"
	 */
	@Test(priority = 8)
	public void work_plan_management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickwork_plan_management();
		String arrange_a_new_work_plan = driverBase.getText(hompageEle.getarrange_a_new_work_plan());
		assertEquals(arrange_a_new_work_plan, "安排新工作计划", "没找到'安排新工作计划'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 8.1点击"安排新的工作计划"链接
	 */
	@Test(priority = 8, dependsOnMethods = "work_plan_management")
	public void arrange_a_new_work_planLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickarrange_a_new_work_planLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement publish_a_new_work_planEle = hompageEle.getPublish_a_new_work_plan();
		String publish_a_new_work_planStr = driverBase.getText(publish_a_new_work_planEle);

		assertEquals(publish_a_new_work_planStr, "发布新的工作计划", "没找到'发布新的工作计划'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 8.2点击"浏览现有工作计划"链接
	 */
	@Test(priority = 8, dependsOnMethods = "work_plan_management")
	public void browse_through_existing_work_plansLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_through_existing_work_plansLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement matters_to_be_dealt_withEle = hompageEle.getMatters_to_be_dealt_with();
		String matters_to_be_dealt_withStr = driverBase.getText(matters_to_be_dealt_withEle);

		assertEquals(matters_to_be_dealt_withStr, "待处理事宜", "没找到'待处理事宜'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 8.3点击"工作计划类别维护"链接
	 */
	@Test(priority = 8, dependsOnMethods = "work_plan_management")
	public void maintenance_of_Work_Plan_CategoryLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickmaintenance_of_Work_Plan_CategoryLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement maintaining_existing_categoriesEle = hompageEle.getMaintaining_existing_categories();
		String maintaining_existing_categoriesStr = driverBase.getText(maintaining_existing_categoriesEle);

		assertEquals(maintaining_existing_categoriesStr, "维护现有类别", "没找到'维护现有类别'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 9.点击"改善提案管理"
	 */
	@Test(priority = 9)
	public void improving_Proposal_Management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickimproving_Proposal_Management();
		String i_want_to_submit_a_proposal = driverBase.getText(hompageEle.geti_want_to_submit_a_proposal());
		assertEquals(i_want_to_submit_a_proposal, "我要提交提案", "没找到'我要提交提案'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 9.1点击"我要提交提案"链接
	 */
	@Test(priority = 9, dependsOnMethods = "improving_Proposal_Management")
	public void i_want_to_submit_a_proposalLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clicki_want_to_submit_a_proposalLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getAdditional_Improvement_Proposals();
		String str = driverBase.getText(ele);

		assertEquals(str, "新增改善提案", "没找到'新增改善提案'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 9.2点击"提案浏览及反馈"链接
	 */
	@Test(priority = 9, dependsOnMethods = "improving_Proposal_Management")
	public void proposal_Browsing_and_FeedbackLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickproposal_Browsing_and_FeedbackLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getImprove_proposal_browsing();
		String str = driverBase.getText(ele);

		assertEquals(str, "改善提案浏览", "没找到'改善提案浏览'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 10.点击"项目跟踪管理"
	 */
	@Test(priority = 10)
	public void project_tracking_management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickproject_tracking_management();
		String additional_projects = driverBase.getText(hompageEle.getadditional_projects());
		assertEquals(additional_projects, "增加项目", "没找到'增加项目'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 10.1点击"增加项目"链接
	 */
	@Test(priority = 10, dependsOnMethods = "project_tracking_management")
	public void additional_projectsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickadditional_projectsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement mainAdditional_projectsEle = hompageEle.getmainAdditional_projects();
		String mainAdditional_projectsStr = driverBase.getText(mainAdditional_projectsEle);

		assertEquals(mainAdditional_projectsStr, "增加项目", "没找到'增加项目'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 10.2点击"周期性项目跟踪"链接
	 */
	@Test(priority = 10, dependsOnMethods = "project_tracking_management")
	public void periodic_project_trackingLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickperiodic_project_trackingLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement mainPeriodic_Project_Tracking_ManagementEle = hompageEle
				.getmainPeriodic_Project_Tracking_Management();
		String mainPeriodic_Project_Tracking_ManagementStr = driverBase
				.getText(mainPeriodic_Project_Tracking_ManagementEle);

		assertEquals(mainPeriodic_Project_Tracking_ManagementStr, "周期性项目跟踪管理", "没找到'周期性项目跟踪管理'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 10.3点击"项目类别名称维护"链接
	 */
	@Test(priority = 10, dependsOnMethods = "project_tracking_management")
	public void project_Category_Name_MaintenanceLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickproject_Category_Name_MaintenanceLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement mainProject_Category_Name_ManagementEle = hompageEle.getmainProject_Category_Name_Management();
		String mainProject_Category_Name_ManagementStr = driverBase.getText(mainProject_Category_Name_ManagementEle);

		assertEquals(mainProject_Category_Name_ManagementStr, "项目类别名称管理", "没找到'项目类别名称管理'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 10.4点击"项目进度名称维护"链接
	 */
	@Test(priority = 10, dependsOnMethods = "project_tracking_management")
	public void maintenance_of_Project_Progress_NameLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickmaintenance_of_Project_Progress_NameLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement mainProject_progress_name_managementEle = hompageEle.getmainProject_progress_name_management();
		String mainProject_progress_name_managementStr = driverBase.getText(mainProject_progress_name_managementEle);

		assertEquals(mainProject_progress_name_managementStr, "项目进度名称管理", "没找到'项目进度名称管理'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 11.点击"单位会议管理"
	 */
	@Test(priority = 11)
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
	@Test(priority = 11, dependsOnMethods = "unit_Meeting_Management")
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
	@Test(priority = 11, dependsOnMethods = "unit_Meeting_Management")
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
	@Test(priority = 11, dependsOnMethods = "unit_Meeting_Management")
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

	/*
	 * 12.点击"单位新闻管理"
	 */
	@Test(priority = 12)
	public void unit_News_Management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickunit_News_Management();
		String publish_news = driverBase.getText(hompageEle.getpublish_news());
		assertEquals(publish_news, "发布新闻", "没找到'发布新闻'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 12.1点击"发布新闻"链接
	 */
	@Test(priority = 12, dependsOnMethods = "unit_News_Management")
	public void publish_newsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickpublish_newsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getPress_release();
		String str = driverBase.getText(ele);

		assertEquals(str, "发布新闻", "没找到'发布新闻'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 12.2点击"浏览新闻"链接
	 */
	@Test(priority = 12, dependsOnMethods = "unit_News_Management")
	public void browse_the_newsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_the_newsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainBrowse_the_News();
		String str = driverBase.getText(ele);

		assertEquals(str, "浏览新闻", "没找到'浏览新闻'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.点击"工作联络单"
	 */
	@Test(priority = 13)
	public void work_contact_sheet() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickwork_contact_sheet();
		String send_Contact_Form = driverBase.getText(hompageEle.getsend_Contact_Form());
		assertEquals(send_Contact_Form, "发送联络单", "没找到'发送联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.1点击"发送联络单"链接
	 */
	@Test(priority = 13, dependsOnMethods = "work_contact_sheet")
	public void send_Contact_FormLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clicksend_Contact_FormLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getSend_Work_Contact_Form();
		String str = driverBase.getText(ele);

		assertEquals(str, "发送工作联络单", "没找到'发送工作联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.2点击"审核联络单"链接
	 */
	@Test(priority = 13, dependsOnMethods = "work_contact_sheet")
	public void audit_contact_sheetLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickaudit_contact_sheetLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getAudit_Contact_Form();
		String str = driverBase.getText(ele);

		assertEquals(str, "审核工作联络单", "没找到'审核工作联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.3点击"浏览联络单"链接
	 */
	@Test(priority = 13, dependsOnMethods = "work_contact_sheet")
	public void browse_contact_sheetsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_contact_sheetsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getBrowse_Work_Contact_Sheet();
		String str = driverBase.getText(ele);

		assertEquals(str, "浏览工作联络单", "没找到'浏览工作联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.4点击"管理联络单"链接
	 */
	@Test(priority = 13, dependsOnMethods = "work_contact_sheet")
	public void management_contact_sheetLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickmanagement_contact_sheetLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainWork_contact_sheet();
		String str = driverBase.getText(ele);

		assertEquals(str, "工作联络单", "没找到'工作联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 14.点击"个人备忘录"
	 */
	@Test(priority = 14)
	public void personal_Memorandum() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickpersonal_Memorandum();
		String additional_memorandum = driverBase.getText(hompageEle.getadditional_memorandum());
		assertEquals(additional_memorandum, "增加备忘录", "没找到'增加备忘录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 14.1点击"增加备忘录"链接
	 */
	@Test(priority = 14, dependsOnMethods = "personal_Memorandum")
	public void additional_memorandumLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());// 进入侧边栏表单

		homepageBus.clickadditional_memorandumLink();

		driverBase.switchToParentFrame();// 返回默认表单

		driverBase.switchToFrame(hompageEle.getpopupIframe());// 进入弹窗表单

		WebElement ele = hompageEle.getAdditional_Personal_Memorandum();
		String str = driverBase.getText(ele);

		assertEquals(str, "新增个人备忘录", "没找到'新增个人备忘录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 14.2点击"浏览备忘录"链接
	 */
	@Test(priority = 14, dependsOnMethods = "personal_Memorandum")
	public void browse_the_MemorandumLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_the_MemorandumLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getPersonal_Diaries_Memo_Browsing();
		String str = driverBase.getText(ele);

		assertEquals(str, "个人日记＆备忘录浏览", "没找到'个人日记＆备忘录浏览'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 15.点击"党员天地"
	 */
	@Test(priority = 15)
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
	@Test(priority = 15, dependsOnMethods = "party_members_world")
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
	@Test(priority = 15, dependsOnMethods = "party_members_world")
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

	/*
	 * 16.点击"视频监视系统"
	 */
	/*
	 * @Test(priority=16) public void video_surveillance_system() {
	 * driverBase.sleep(1000);
	 * driverBase.switchToFrame(hompageEle.getLeftIframe());//进入左侧边栏表单
	 * homepageBus.clickvideo_surveillance_system();//点击"视频监视系统"
	 * driverBase.switchToParentFrame();//返回默认表单
	 * driverBase.switchToFrame(hompageEle.getMainIframe());//进入主窗口表单 String
	 * Server_not_found=driverBase.getText(hompageEle.getServer_not_found());
	 * assertEquals(Server_not_found, "找不到服务器", "没找到'找不到服务器'!");
	 * driverBase.switchToParentFrame();//再次返回默认表单 }
	 */

	/*
	 * 18.点击"MIS信息通"
	 */
	@Test(priority = 18)
	public void MIS_Information_Communication() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		driverBase.waitUntilPageContainText("MIS信息通");
		homepageBus.clickMIS_Information_Communication();
		driverBase.switchToParentFrame();
		driverBase.switchToFrame(hompageEle.getMainIframe());
		String Communication_management = driverBase.getText(hompageEle.getCommunication_management());
		assertEquals(Communication_management, "信息通通话管理", "没找到'信息通通话管理'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.点击"点睛管理之道"
	 */
	@Test(priority = 18)
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
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_MIS_Information_Communication() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_MIS_Information_Communication();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_MIS_Information_Communication());
		assertEquals(str, "点晴MIS信息通（IM）", "没找到'点晴MIS信息通（IM）'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.2鼠标悬停"点晴进销存管理系统"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Invoicing_management_system() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Invoicing_management_system();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_main_Invoicing_management_system());
		assertEquals(str, "点晴进销存管理系统", "没找到'点晴进销存管理系统'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.3鼠标悬停"点晴CRM客户管理系统"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Customer_Management_System() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Customer_Management_System();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_main_Customer_Management_System());
		assertEquals(str, "点晴CRM客户管理系统", "没找到'点晴CRM客户管理系统'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.4鼠标悬停"点晴全员考勤解决方案"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Solution_of_full_attendance() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Solution_of_full_attendance();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_main_Solution_of_full_attendance());
		assertEquals(str, "点晴全员考勤解决方案", "没找到'点晴全员考勤解决方案'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.5鼠标悬停"点晴WMS仓储管理系统"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Warehouse_Management_System() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Warehouse_Management_System();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Warehouse_Management_System());
		assertEquals(str, "点晴WMS仓储管理系统", "没找到'点晴WMS仓储管理系统'!");
		driverBase.switchToParentFrame();
	}
	
	/*
	 * 18.0.5鼠标悬浮"点晴WMS仓储管理系统"
	 */
//	@Test(priority = 18)
//	public void dianqings_Way_of_Management2() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(dQWayOfMgtPopEle.getLeftIframe());
//		dQWayOfMgtPopBus.clickDianqings_Way_of_Management();
//		
//		driverBase.switchToParentFrame();
//		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
//		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());
//		
//		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Warehouse_Management_System());
//		assertEquals(str, "点晴WMS仓储管理系统", "没找到'点晴WMS仓储管理系统'!");
//		driverBase.switchToParentFrame();
//	}

	/*
	 * 18.6鼠标悬停"点晴DRP微信分销系统"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Wechat_Distribution_System() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Wechat_Distribution_System();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Wechat_Distribution_System());
		assertEquals(str, "点晴DRP微信分销系统", "没找到'点晴DRP微信分销系统'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.7鼠标悬停"点晴EBR预算报销系统"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Budget_reimbursement_system() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Budget_reimbursement_system();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Budget_reimbursement_system());
		assertEquals(str, "点晴EBR预算报销系统", "没找到'点晴EBR预算报销系统'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.8鼠标悬停"点晴Inet内网通方案"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Intranet_Communication_Scheme() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Intranet_Communication_Scheme();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Intranet_Communication_Scheme());
		assertEquals(str, "点晴Inet内网通方案", "没找到'点晴Inet内网通方案'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.9鼠标悬停"点晴PMS港口管理理系统"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Port_Management_System() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Port_Management_System();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Port_Management_System());
		assertEquals(str, "点晴PMS港口管理理系统", "没找到'点晴PMS港口管理理系统'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.10鼠标悬停"点晴ERP企业管理系统"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Enterprise_Management_System() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Enterprise_Management_System();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Enterprise_Management_System());
		assertEquals(str, "点晴ERP企业管理系统", "没找到'点晴ERP企业管理系统'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.11鼠标悬停"点晴模切ERP管理系统"
	 */
	@Test(priority = 18, dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Die_cutting_ERP_Management_System() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Die_cutting_ERP_Management_System();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Die_cutting_ERP_Management_System());
		assertEquals(str, "点晴模切ERP管理系统", "没找到'点晴模切ERP管理系统'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.1.6点击"点晴MIS信息通（IM）"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_MIS_Information_Communication")
	public void winMain_Experience_Start1() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start1();

		driverBase.switchToCurrentPage();

		String str = driverBase.getURL();

		assertEquals(str, "http://im.clicksun.cn/im/download.htm", "页面跳转失败!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.2.6点击"点晴进销存管理系统"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Invoicing_management_system")
	public void winMain_Experience_Start2() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start2();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面

		driverBase.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getJCXleft_menu());// 进入新页面侧边栏表单

		WebElement ele = dQWayOfMgtPopEle.getJCX_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);

		assertEquals(str, "点晴JCX子系统", "没找到'点晴JCX子系统'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.3.6点击"点晴CRM客户管理系统"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Customer_Management_System")
	public void winMain_Experience_Start3() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start3();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面

		driverBase.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getJCXleft_menu());// 进入新页面侧边栏表单

		WebElement ele = dQWayOfMgtPopEle.getCRM_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "点晴CRM子系统", "没找到'点晴CRM子系统'!");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.4.6点击"点晴全员考勤解决方案"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Solution_of_full_attendance")
	public void winMain_Experience_Start4() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start4();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面

		driverBase.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getJCXleft_menu());// 进入新页面侧边栏表单

		WebElement ele = dQWayOfMgtPopEle.getHuman_Resources_Management();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "人力资源管理", "没找到'人力资源管理'!");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.5.6点击"点晴WMS仓储管理系统"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Warehouse_Management_System")
	public void winMain_Experience_Start5() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start5();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面

		driverBase.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getJCXleft_menu());// 进入新页面侧边栏表单

		WebElement ele = dQWayOfMgtPopEle.getWMS_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "点晴WMS子系统", "没找到'点晴WMS子系统'!");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.6.6点击"点晴DRP微信分销系统"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Wechat_Distribution_System")
	public void winMain_Experience_Start6() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start6();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面

		driverBase.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getJCXleft_menu());// 进入新页面侧边栏表单

		WebElement ele = dQWayOfMgtPopEle.getDPR_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "点晴DRP子系统", "没找到'点晴DRP子系统'!");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.7.6点击"点晴EBR预算报销系统"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Budget_reimbursement_system")
	public void winMain_Experience_Start7() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start7();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面

		driverBase.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getJCXleft_menu());// 进入新页面侧边栏表单

		WebElement ele = dQWayOfMgtPopEle.getEBR_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "点晴EBR子系统", "没找到'点晴EBR子系统'!");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.8.6点击"点晴Inet内网通方案"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Intranet_Communication_Scheme")
	public void winMain_Experience_Start8() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start8();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("点晴内网通：无公网IP访问局域网内点晴OA服务器实现移动办公的最佳方法│穿透家里内网外网点设置登录参数公司固定动态系统如何教程获取二级域名费用需要注册PC手机APP无法哪些端口(点晴MIS系统内部教程)");// 根据页面title进入当前页面

		WebElement ele = dQWayOfMgtPopEle.getUser_Question_Answering();// 获取目标元素
		Boolean bool = driverBase.isExsit(ele);

		assertTrue(bool, "错误！");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.9.6点击"点晴PMS港口管理系统"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Port_Management_System")
	public void winMain_Experience_Start9() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start9();// 点击"开始体验"

		driverBase.sleep(2000);
		
		List<String> handles = driverBase.getWindowsHandles();//获取所有句柄 
		for (String s : handles) {
			System.out.println(s);//打印所有句柄
		}
		driverBase.switchToWindow(handles.get(handles.size() - 1));//页面切换到最后一个句柄
		
//		driverBase.switchToCurrentWindow();
//		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面
		
		String handle = driverBase.getWindowHandle();
		System.out.println("当前句柄handle:"+handle);
		
		driverBase.sleep(2000);

//		driverBase.acceptAlert();
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getJCXleft_menu());// 进入新页面侧边栏表单

		WebElement ele = dQWayOfMgtPopEle.getPMS_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "点晴PMS子系统", "没找到'点晴PMS子系统'!");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.10.6点击"点晴ERP企业管理系统"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Enterprise_Management_System")
	public void winMain_Experience_Start10() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start10();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面

		driverBase.sleep(2000);

		driverBase.acceptAlert();
		
//		Robot robot = new Robot();
//		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
//		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getJCXleft_menu());// 进入新页面侧边栏表单

		WebElement ele = dQWayOfMgtPopEle.getERP_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "点晴ERP子系统", "没找到'点晴ERP子系统'!");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.11.6点击"点晴模切ERP管理系统"页"立即体验"
	 */
	@Test(priority = 18, dependsOnMethods = "winLeft_Die_cutting_ERP_Management_System")
	public void winMain_Experience_Start11() throws AWTException {
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start11();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面

		driverBase.sleep(1000);

		driverBase.acceptAlert();
		
//		Robot robot = new Robot();
//		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
//		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getmain_Die_cutting_ERP_Subsystem_iframe());// 进入新页面主页表单

		WebElement ele = dQWayOfMgtPopEle.getmain_ERP_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "点晴ERP子系统", "没找到'点晴ERP子系统'!");//断言
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.点击"万能魔表管理"
	 */
//	@Test(priority = 18)
//	public void universal_Magic_Table_Management() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(dQWayOfMgtPopEle.getLeftIframe());
//		dQWayOfMgtPopBus.clickuniversal_Magic_Table_Management();
//		String new_Magic_Watch = driverBase.getText(dQWayOfMgtPopEle.getnew_Magic_Watch());
//		assertEquals(new_Magic_Watch, "新增万能魔表", "没找到'新增万能魔表'!");
//		driverBase.switchToParentFrame();
//	}

	/*
	 * 18.1点击"新增万能魔表"链接
	 */
//	@Test(priority = 18, dependsOnMethods = "universal_Magic_Table_Management")
//	public void new_Magic_WatchLink() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(dQWayOfMgtPopEle.getLeftIframe());
//
//		dQWayOfMgtPopBus.clicknew_Magic_WatchLink();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(dQWayOfMgtPopEle.getMainIframe());// 进入主窗口表单
//
//		WebElement ele = dQWayOfMgtPopEle.getmainNew_Magic_Watch();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "新增万能魔表", "没找到'新增万能魔表'!");
//		driverBase.switchToParentFrame();
//	}

	/*
	 * 18.2点击"万能魔表维护"链接
	 */
//	@Test(priority = 18, dependsOnMethods = "universal_Magic_Table_Management")
//	public void universal_Magic_Watch_MaintenanceLink() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(dQWayOfMgtPopEle.getLeftIframe());
//
//		dQWayOfMgtPopBus.clickuniversal_Magic_Watch_MaintenanceLink();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(dQWayOfMgtPopEle.getMainIframe());// 进入主窗口表单
//
//		WebElement ele = dQWayOfMgtPopEle.getUniversal_Magic_Table_Maintenance();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "万能魔表维护", "没找到'万能魔表维护'!");
//		driverBase.switchToParentFrame();
//	}

	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
