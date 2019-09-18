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

public class Test019_WinSidebar_DianqingsWayOfManagement extends CaseBase {

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
	@Test(priority = 19,description="验证：点击'MIS信息通'")
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
	@Test(priority = 19,description="验证：悬停\"点晴MIS信息通（IM）\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴进销存管理系统\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴CRM客户管理系统\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴全员考勤解决方案\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴WMS仓储管理系统\"", dependsOnMethods = "dianqings_Way_of_Management")
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
//	@Test(priority = 19,description="验证：悬浮"点晴WMS仓储管理系统"")
//	public void dianqings_Way_of_Management2() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//		homepageBus.clickDianqings_Way_of_Management();
//		
//		driverBase.switchToParentFrame();
//		driverBase.switchToFrame(hompageEle.getBallistic_Window_of_ManagementIframe());
//		driverBase.switchToFrame(hompageEle.getBallistic_Window_of_ManagementIframe_csun());
//		
//		String str = driverBase.getText(hompageEle.getWinMain_Warehouse_Management_System());
//		assertEquals(str, "点晴WMS仓储管理系统", "没找到'点晴WMS仓储管理系统'!");
//		driverBase.switchToParentFrame();
//	}

	/*
	 * 18.6鼠标悬停"点晴DRP微信分销系统"
	 */
	@Test(priority = 19,description="验证：悬停\"点晴DRP微信分销系统\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴EBR预算报销系统\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴Inet内网通方案\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴PMS港口管理理系统\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴ERP企业管理系统\"", dependsOnMethods = "dianqings_Way_of_Management")
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
	@Test(priority = 19,description="验证：悬停\"点晴模切ERP管理系统\"", dependsOnMethods = "dianqings_Way_of_Management")
	public void winLeft_Die_cutting_ERP_Management_System() {
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Die_cutting_ERP_Management_System();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Die_cutting_ERP_Management_System());
		assertEquals(str, "点晴模切ERP管理系统", "没找到'点晴模切ERP管理系统'!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
