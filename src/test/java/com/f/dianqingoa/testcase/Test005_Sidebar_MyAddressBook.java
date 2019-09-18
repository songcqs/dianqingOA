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

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class Test005_Sidebar_MyAddressBook extends CaseBase {

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
	 * 4.点击展开"我的通讯录"
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("展开'我的通讯录'")
//	@Title("我的通讯录")
	@Test(priority = 5,description="验证：展开'我的通讯录'")
	public void my_address_book() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickmy_address_book();
		String unit_Address_Book = driverBase.getText(hompageEle.getunit_Address_Book());
		assertEquals(unit_Address_Book, "单位通讯录", "没找到'单位通讯录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 4.1点击"单位通讯录"链接
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'单位通讯录'")
//	@Title("单位通讯录")
	@Test(priority = 5,description="验证：点击'单位通讯录'", dependsOnMethods = "my_address_book")
	public void unit_Address_BookLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickunit_Address_BookLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainUnit_Address_Book();
		String str = driverBase.getText(ele);

		assertEquals(str, "单位通讯录", "没找到'单位通讯录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 4.2点击"个人通讯录"链接
	 */
	@Epic("点晴OA")
	@Feature("侧边栏按钮")
	@Story("点击'个人通讯录'")
//	@Title("个人通讯录")
	@Test(priority = 5,description="验证：点击'个人通讯录'", dependsOnMethods = "my_address_book")
	public void personal_Address_BookLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickpersonal_Address_BookLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainPerson_Address_Book();
		String str = driverBase.getText(ele);

		assertEquals(str, "个人通讯录", "没找到'个人通讯录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 4.3点击"外部通讯录"链接
	 */
	@Test(priority = 5, dependsOnMethods = "my_address_book", description="验证：点击'外部通讯录'")
	public void external_Address_BookLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickexternal_Address_BookLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainExternal_Address_Book();
		String str = driverBase.getText(ele);

		assertEquals(str, "外部通讯录", "没找到'外部通讯录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 4.4点击"个人资料维护"链接
	 */
	@Test(priority = 5, dependsOnMethods = "my_address_book", description="验证：点击'个人资料维护'")
	public void personal_Data_MaintenanceLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickpersonal_Data_MaintenanceLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getPersonnel_Data_Maintenance();
		String str = driverBase.getText(ele);

		assertEquals(str, "个人资料维护", "没找到'个人资料维护'!");
		driverBase.switchToParentFrame();
	}

	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
