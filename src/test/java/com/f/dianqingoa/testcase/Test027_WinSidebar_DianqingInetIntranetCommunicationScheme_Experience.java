package com.f.dianqingoa.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
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

public class Test027_WinSidebar_DianqingInetIntranetCommunicationScheme_Experience extends CaseBase {

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
//	@Test(priority = 27)
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
	 * 18.8鼠标悬停"点晴Inet内网通方案"
	 */
//	@Test(priority = 27, dependsOnMethods = "dianqings_Way_of_Management")
	@Test(priority = 27, description="悬停\"点晴Inet内网通方案\"")
	public void winLeft_Intranet_Communication_Scheme() {
		
		dianqings_Way_of_Management();
		
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe());
		driverBase.switchToFrame(dQWayOfMgtPopEle.getBallistic_Window_of_ManagementIframe_csun());

		dQWayOfMgtPopBus.roverWinLeft_Intranet_Communication_Scheme();

		String str = driverBase.getText(dQWayOfMgtPopEle.getWinMain_Intranet_Communication_Scheme());
		assertEquals(str, "点晴Inet内网通方案", "没找到'点晴Inet内网通方案'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 18.8.6点击"点晴Inet内网通方案"页"立即体验"
	 */
	@Test(priority = 27,description="点击\"点晴Inet内网通方案\"页\"立即体验\"",dependsOnMethods = "winLeft_Intranet_Communication_Scheme")
//	@Test(priority = 27)
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
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
