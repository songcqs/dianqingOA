package com.f.dianqingoa.testcase;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
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

public class Test030_WinSidebar_DianqingDiecuttingERPManagementSystem_Experience extends CaseBase {

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
//	@Test(priority = 30,description = "点击'点睛管理之道'")
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
	 * 18.11鼠标悬停"点晴模切ERP管理系统"
	 */
//	@Test(priority = 30,description = "鼠标悬停'点晴模切ERP管理系统'", dependsOnMethods = "dianqings_Way_of_Management")
	@Test(priority = 30,description = "鼠标悬停'点晴模切ERP管理系统'")
	public void winLeft_Die_cutting_ERP_Management_System() {
		
		dianqings_Way_of_Management();
		
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Die_cutting_ERP_Management_System();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Die_cutting_ERP_Management_System());
		assertEquals(str, "点晴模切ERP管理系统", "没找到'点晴模切ERP管理系统'!");
		driverBase.switchToParentFrame();
	}
	
	/*
	 * 18.11.6点击"点晴模切ERP管理系统"页"立即体验"
	 */
	@Test(priority = 30,description = "验证点击'点晴模切ERP管理系统'页'立即体验'跳转至'点晴ERP子系统'", dependsOnMethods = "winLeft_Die_cutting_ERP_Management_System")
	public void winMain_Experience_Start11() throws AWTException {
		
		driverBase.sleep(1000);
		// 进入弹窗侧边栏表单
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.clickWinMain_Experience_Start11();// 点击"开始体验"

		driverBase.sleep(1000);

		driverBase.switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");// 根据页面title进入当前页面
//		List<String> handles = driverBase.getWindowsHandles();//获取所有句柄 
//		for (String s : handles) {
//			System.out.println(s);//打印所有句柄
//		}
//		driverBase.switchToWindow(handles.get(handles.size() - 1));//页面切换到最后一个句柄

		driverBase.sleep(1000);

//		driverBase.acceptAlert();
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER); // 模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER); // 释放按键

		driverBase.switchToFrame(dQWayOfMgtPopEle.getmain_Die_cutting_ERP_Subsystem_iframe());// 进入新页面主页表单

		WebElement ele = dQWayOfMgtPopEle.getmain_ERP_Subsystem();// 获取目标元素
		String str = driverBase.getText(ele);//获取元素文本

		assertEquals(str, "点晴ERP子系统", "没找到'点晴ERP子系统'!");//断言
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
