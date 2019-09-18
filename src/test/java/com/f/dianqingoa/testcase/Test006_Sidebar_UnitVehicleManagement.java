//package com.f.dianqingoa.testcase;
//
//import static org.testng.Assert.assertEquals;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.a.publish.base.DriverBase;
//import com.b.publish.util.ReadProperties;
//import com.c.dianqingoa.element.HompageEle;
//import com.e.dianqingoa.business.HomepageBus;
//import com.e.dianqingoa.business.OfficialWebsitePageBus;
//import com.f.muke.testcase.CaseBase;
//
//public class Test006_Sidebar_UnitVehicleManagement extends CaseBase {
//
//	public DriverBase driverBase;
//	public ReadProperties properties;
//	public OfficialWebsitePageBus officialWebsitePageBus;
//	public HompageEle hompageEle;
//	public HomepageBus homepageBus;
//
//	@BeforeClass
//	public void beforeClass() {
//
//		this.driverBase = initDriverBase("chrome");
//		properties = new ReadProperties("dianqingoa.properties");
//		// 设置系统响应时间为10秒钟
//		driverBase.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driverBase.get(properties.getProperties("url"));
//		driverBase.maxBrowser();
//		driverBase.waitUntilPageContainText("在线体验");// 等待页面加载出"在线体验"
//		officialWebsitePageBus = new OfficialWebsitePageBus(driverBase);
//
//		hompageEle = new HompageEle(driverBase);
//		homepageBus = new HomepageBus(driverBase);
//		officialWebsitePageBus.clickOnlineExperience();
//		driverBase.switchToCurrentWindow();
////		driverBase.sleep(1000);
////		driverBase.switchToFrame(hompageEle.getLeftIframe());
//	}
//	
//	/*
//	 * 5.点击"单位车辆管理"
//	 */
//	@Test(priority = 6,description="验证：展开'单位车辆管理'")
//	public void unit_Vehicle_Management() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//		homepageBus.clickUnit_Vehicle_Management();
//		String vehicle_reservation = driverBase.getText(hompageEle.getVehicle_reservationText());
//		assertEquals(vehicle_reservation, "车辆预约", "没找到'车辆预约'!");
//		driverBase.switchToParentFrame();
//	}
//
//	/*
//	 * 5.1点击"车辆预约"
//	 */
//	@Test(priority = 6,description="验证：点击'车辆预约'", dependsOnMethods = "unit_Vehicle_Management")
//	public void vehicle_reservation() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//
//		homepageBus.clickVehicle_reservation();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
//
//		WebElement ele = hompageEle.getApplication_Form_for_Vehicle_Reservation();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "车辆预约申请表", "没找到'车辆预约申请表'!");
//		driverBase.switchToParentFrame();
//	}
//
//	/*
//	 * 5.2点击"车辆占用情况"
//	 */
//	@Test(priority = 6,description="验证：点击'车辆占用情况'", dependsOnMethods = "unit_Vehicle_Management")
//	public void occupancy_of_vehicles() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//
//		homepageBus.clickOccupancy_of_vehicles();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
//
//		WebElement ele = hompageEle.getVehicle_Occupancy_Diagram();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "车辆占用图示", "没找到'车辆占用图示'!");
//		driverBase.switchToParentFrame();
//	}
//	
//	/*
//	 * 5.3点击"用车审核管理"
//	 */
//	@Test(priority = 6,description="验证：点击'用车审核管理'", dependsOnMethods = "unit_Vehicle_Management")
//	public void vehicle_Audit_Management() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//
//		homepageBus.clickVehicle_Audit_Management();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
//
//		WebElement ele = hompageEle.getExamination_of_Vehicle_Reservation_Application();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "车辆预约申请审核", "没找到'车辆预约申请审核'!");
//		driverBase.switchToParentFrame();
//	}
//	
//	/*
//	 * 5.4点击"车辆使用记录"
//	 */
//	@Test(priority = 6,description="验证：点击'车辆使用记录'", dependsOnMethods = "unit_Vehicle_Management")
//	public void vehicle_use_record() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//
//		homepageBus.clickVehicle_use_record();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
//
//		WebElement ele = hompageEle.getmain_Vehicle_use_record();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "车辆使用记录", "没找到'车辆使用记录'!");
//		driverBase.switchToParentFrame();
//	}
//	
//	/*
//	 * 5.5点击"车辆信息管理"
//	 */
//	@Test(priority = 6,description="验证：点击'车辆信息管理'", dependsOnMethods = "unit_Vehicle_Management")
//	public void vehicle_Information_Management() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//
//		homepageBus.clickVehicle_Information_Management();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
//
//		driverBase.sleep(1000);
//		WebElement ele = hompageEle.getVehicle_information();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "车辆信息", "没找到'车辆信息'!");
//		driverBase.switchToParentFrame();
//	}
//	
//	/*
//	 * 5.6点击"车辆费用管理"
//	 */
//	@Test(priority = 6,description="验证：点击'车辆费用管理'", dependsOnMethods = "unit_Vehicle_Management")
//	public void vehicle_Cost_Management() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//
//		homepageBus.clickVehicle_Cost_Management();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
//
//		WebElement ele = hompageEle.getmain_Vehicle_Cost_Management();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "车辆费用管理", "没找到'车辆费用管理'!");
//		driverBase.switchToParentFrame();
//	}
//	
//	/*
//	 * 5.7点击"基础信息设置"
//	 */
//	@Test(priority = 6,description="验证：点击'基础信息设置'", dependsOnMethods = "unit_Vehicle_Management")
//	public void basic_Information_Settings() {
//		driverBase.sleep(1000);
//		driverBase.switchToFrame(hompageEle.getLeftIframe());
//
//		homepageBus.clickBasic_Information_Settings();
//
//		driverBase.switchToParentFrame();// 返回默认表单
//		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
//
//		WebElement ele = hompageEle.getmain_Basic_Information_Settings();
//		String str = driverBase.getText(ele);
//
//		assertEquals(str, "基础信息设置", "没找到'基础信息设置'!");
//		driverBase.switchToParentFrame();
//	}
//	
//	@AfterClass
//	public void afterClass() {
//		driverBase.sleep(2000);
////		driverBase.closeCurrentBrowser();
//		driverBase.closeAllBrowser();
//	}
//}
