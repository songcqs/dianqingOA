package com.f.muke.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.a.publish.base.DriverBase;
import com.b.publish.util.HandleCookie;
import com.b.publish.util.ReadProperties;
import com.b.publish.util.RetryListener;
import com.b.publish.util.TestngListener;
import com.c.muke.page.HomePage;
import com.e.muke.bussiness.HomePageBus;
import com.e.muke.bussiness.LoginPageBus;

/*
 * 登出测试
 */
@Listeners({ RetryListener.class, TestngListener.class })
public class SuiteTest002_Logout {

	public DriverBase driver;
	public ReadProperties properties;
	public LoginPageBus loginbus;
	public HomePageBus homePageBus;
	public HandleCookie handleCookie;
	public HomePage homePage;

	public SuiteCookieLogin suiteCookieLogin;

	// 相当于构造方法
	@BeforeClass
//	@BeforeMethod
	public void beforeClass() {
		suiteCookieLogin = new SuiteCookieLogin();
		suiteCookieLogin.cookieLogin();
		this.driver = suiteCookieLogin.driverBase;
		homePageBus = new HomePageBus(driver);
		homePage = new HomePage(driver);
//		this.driver = initDriverBase("chrome");
//		properties = new ReadProperties("loginTest.properties");
//		handleCookie = new HandleCookie(driver);
//		// 设置系统响应时间为10秒钟
//		driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		loginbus = new LoginPageBus(driver);
//		homePageBus = new HomePageBus(driver);
//		driver.get(properties.getProperties("url"));
//		homePage = new HomePage(driver);
//		driver.maxBrowser();
	}


	@Test
	public void testLogout() {

		homePageBus.clickLogout();

		driver.sleep(2000);
		String text = driver.getText(homePage.getLoginButtonElement());
		assertEquals(text, "登录", "退出失败！！");
	}

	@AfterClass
	public void afterClass() {
//		driver.getDriver().close();
		driver.sleep(2000);
		driver.closeCurrentBrowser();
	}

}
