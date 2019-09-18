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

public class Test003_Sidebar_WorkFlowManagement extends CaseBase {

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
	 * 2.点击展开"工作流管理"
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("展开'工作流管理'")
//	@Title("工作流管理")
	@Test(priority = 3,description="验证：展开'工作流管理'")
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
//	@Test(priority = 3, dependsOnMethods = "workflow_management")
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'工作流申请'")
//	@Title("工作流申请")
	@Test(priority = 3,description="验证：点击'工作流管理'")
	public void workflow_applicationLink() {
		workflow_management();
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
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'我的审批'")
//	@Title("我的审批")
	@Test(priority = 3, dependsOnMethods = "workflow_management",description="验证：点击'我的审批'")
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
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'我的申请'")
//	@Title("我的申请")
	@Test(priority = 3, dependsOnMethods = "workflow_management",description="验证：点击'我的申请'")
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
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'已办工作流'")
//	@Title("已办工作流")
	@Test(priority = 3, dependsOnMethods = "workflow_management",description="验证：点击'已办工作流'")
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
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'模板管理'")
//	@Title("模板管理")
	@Test(priority = 3, dependsOnMethods = "workflow_management",description="验证：点击'模板管理'")
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
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'流程管理'")
//	@Title("流程管理")
	@Test(priority = 3, dependsOnMethods = "workflow_management",description="验证：点击'流程管理'")
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
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'参数设置'")
//	@Title("参数设置")
	@Test(priority = 3, dependsOnMethods = "workflow_management",description="验证：点击'参数设置'")
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
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
