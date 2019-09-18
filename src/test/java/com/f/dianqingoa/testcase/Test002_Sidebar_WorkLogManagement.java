package com.f.dianqingoa.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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

public class Test002_Sidebar_WorkLogManagement extends CaseBase {

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
	
	@DataProvider(name = "dp")
	public Object[][] dp() {
		return new Object[][] { { "验证：点击'工作日志管理'" }};
	}

	/**
	 * 1.点击展开"工作日志管理"
	 */
//	@Test(dependsOnMethods="com.f.dianqingoa.testcase.Test001_OnlineExperience.onlineExperience")
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("展开'工作日志管理'")
//	@Title("工作日志管理")
	@Test(priority = 2,description="验证：展开'工作日志管理'",dataProvider="dp")
	public void workLogManagemen(String name) {
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

	/**
	 * 1.1点击"我的工作日志"
	 */
//	@Test(priority = 2, dependsOnMethods = "workLogManagemen",description="验证：点击'我的工作日志'")
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'我的工作日志'")
//	@Title("我的工作日志")
	@Test(priority = 2, description="验证：点击'我的工作日志'")
	public void my_Job_LogEle() {
		workLogManagemen(null);
		
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickMyJobLogLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement my_Job_LogEle = hompageEle.getMy_Job_Log();
		String my_Job_LogStr = driverBase.getText(my_Job_LogEle);

		assertTrue(my_Job_LogStr.contains("我的工作日志"), "跳转失败！！！");
		driverBase.switchToParentFrame();
	}

	/**
	 * 1.2点击"他人工作日志"
	 */
//	@Test(priority = 2, dependsOnMethods = "workLogManagemen",description="验证：点击'他人工作日志'")
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'他人工作日志'")
//	@Title("他人工作日志")
	@Test(priority = 2, description="验证：点击'他人工作日志'")
	public void otherPeoplesWorkLog() {
		workLogManagemen(null);
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

	/**
	 * 1.3点击"日志参数设置"
	 */
//	@Test(priority = 2, dependsOnMethods = "workLogManagemen",description="验证：点击'日志参数设置'")
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'日志参数设置'")
//	@Title("日志参数设置")
	@Test(priority = 2, description="验证：点击'日志参数设置'")
	public void logParameterSetting() {
		
		workLogManagemen(null);
		
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

	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
