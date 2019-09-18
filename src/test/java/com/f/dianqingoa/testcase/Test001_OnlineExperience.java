package com.f.dianqingoa.testcase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.a.publish.base.DriverBase;
import com.b.publish.util.HandleCookie;
import com.b.publish.util.ReadProperties;
import com.c.muke.page.HomePage;
import com.e.dianqingoa.business.OfficialWebsitePageBus;
import com.e.muke.bussiness.HomePageBus;
import com.e.muke.bussiness.LoginPageBus;
import com.f.muke.testcase.CaseBase;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

/*
 * 官网页面跳转至OA首页
 */
public class Test001_OnlineExperience extends CaseBase {
	
	public DriverBase driver;
	public ReadProperties properties;
	
	public OfficialWebsitePageBus officialWebsitePageBus;
	
	@BeforeClass
	public void beforeClass() {
		this.driver = initDriverBase("chrome");
		properties = new ReadProperties("dianqingoa.properties");
		// 设置系统响应时间为10秒钟
		driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.getProperties("url"));
		driver.maxBrowser();
		driver.waitUntilPageContainText("在线体验");//等待页面加载出"在线体验"
		officialWebsitePageBus= new OfficialWebsitePageBus(driver);
	}
	
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'在线体验'")
//	@Title(value = "在线体验")
	@Test(priority = 1,description="验证：官网页面点击'在线体验'跳转至OA首页")
	public void onlineExperience() {
		officialWebsitePageBus.clickOnlineExperience();
		driver.switchToCurrentPage();
		String s1=driver.getTitle();
		assertEquals(s1, "深圳市点晴信息技术有限公司点晴MIS管理信息系统", "跳转失败！！！");
	}
	
	@AfterClass
	public void afterClass() {
		driver.sleep(1000);
		driver.closeCurrentBrowser();
	}
}
