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

public class Test008_Sidebar_WorkReportManagement extends CaseBase {

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
	 * 7.点击"工作报告管理"
	 */
	@Test(priority = 8,description="验证：展开'工作报告管理'")
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
	@Test(priority = 8,description="验证：点击'安排工作报告'",dependsOnMethods = "work_report_management")
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
	@Test(priority = 8,description="验证：点击'工作报告管理'",dependsOnMethods = "work_report_management")
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
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
