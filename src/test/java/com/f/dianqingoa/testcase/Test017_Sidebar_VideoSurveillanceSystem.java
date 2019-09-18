package com.f.dianqingoa.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.a.publish.base.DriverBase;
import com.b.publish.util.ReadProperties;
import com.c.dianqingoa.element.HompageEle;
import com.e.dianqingoa.business.HomepageBus;
import com.e.dianqingoa.business.OfficialWebsitePageBus;
import com.f.muke.testcase.CaseBase;

public class Test017_Sidebar_VideoSurveillanceSystem extends CaseBase {

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
	 * 16.点击"视频监视系统"
	 */
	/*
	 * @Test(priority=17,description="验证：点击'视频监视系统'") public void video_surveillance_system() {
	 * driverBase.sleep(1000);
	 * driverBase.switchToFrame(hompageEle.getLeftIframe());//进入左侧边栏表单
	 * homepageBus.clickvideo_surveillance_system();//点击"视频监视系统"
	 * driverBase.switchToParentFrame();//返回默认表单
	 * driverBase.switchToFrame(hompageEle.getMainIframe());//进入主窗口表单 String
	 * Server_not_found=driverBase.getText(hompageEle.getServer_not_found());
	 * assertEquals(Server_not_found, "找不到服务器", "没找到'找不到服务器'!");
	 * driverBase.switchToParentFrame();//再次返回默认表单 }
	 */
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
