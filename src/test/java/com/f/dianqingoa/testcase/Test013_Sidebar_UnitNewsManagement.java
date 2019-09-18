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

public class Test013_Sidebar_UnitNewsManagement extends CaseBase {

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
	 * 12.点击"单位新闻管理"
	 */
	@Test(priority = 13,description="验证：展开'单位新闻管理'")
	public void unit_News_Management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickunit_News_Management();
		String publish_news = driverBase.getText(hompageEle.getpublish_news());
		assertEquals(publish_news, "发布新闻", "没找到'发布新闻'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 12.1点击"发布新闻"链接
	 */
	@Test(priority = 13,description="验证：点击'发布新闻'", dependsOnMethods = "unit_News_Management")
	public void publish_newsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickpublish_newsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getPress_release();
		String str = driverBase.getText(ele);

		assertEquals(str, "发布新闻", "没找到'发布新闻'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 12.2点击"浏览新闻"链接
	 */
	@Test(priority = 13,description="验证：点击'浏览新闻'", dependsOnMethods = "unit_News_Management")
	public void browse_the_newsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_the_newsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainBrowse_the_News();
		String str = driverBase.getText(ele);

		assertEquals(str, "浏览新闻", "没找到'浏览新闻'!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
