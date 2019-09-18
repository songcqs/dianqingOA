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

public class Test009_Sidebar_WorkPlanManagement extends CaseBase {

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
	 * 8.点击"工作计划管理"
	 */
	@Test(priority = 9,description="验证：展开'工作计划管理'")
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
	@Test(priority = 9,description="验证：点击'安排新的工作计划'", dependsOnMethods = "work_plan_management")
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
	@Test(priority = 9,description="验证：点击'浏览现有工作计划'", dependsOnMethods = "work_plan_management")
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
	@Test(priority = 9,description="验证：点击'工作计划类别维护'", dependsOnMethods = "work_plan_management")
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
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
