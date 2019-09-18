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

public class Test011_Sidebar_ProjectTrackingManagement extends CaseBase {

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
	 * 10.点击"项目跟踪管理"
	 */
	@Test(priority = 11,description="验证：展开'项目跟踪管理'")
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
	@Test(priority = 11,description="验证：点击'增加项目'", dependsOnMethods = "project_tracking_management")
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
	@Test(priority = 11,description="验证：点击'周期性项目跟踪'", dependsOnMethods = "project_tracking_management")
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
	@Test(priority = 11,description="验证：点击'项目类别名称维护'", dependsOnMethods = "project_tracking_management")
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
	@Test(priority = 11, description="验证：点击'项目进度名称维护'",dependsOnMethods = "project_tracking_management")
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
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
