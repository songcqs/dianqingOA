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

public class Test014_Sidebar_WorkContactSheet extends CaseBase {

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
	 * 13.点击"工作联络单"
	 */
	@Test(priority = 14,description="验证：展开'工作联络单'")
	public void work_contact_sheet() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickwork_contact_sheet();
		String send_Contact_Form = driverBase.getText(hompageEle.getsend_Contact_Form());
		assertEquals(send_Contact_Form, "发送联络单", "没找到'发送联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.1点击"发送联络单"链接
	 */
	@Test(priority = 14,description="验证：点击'发送联络单'", dependsOnMethods = "work_contact_sheet")
	public void send_Contact_FormLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clicksend_Contact_FormLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getSend_Work_Contact_Form();
		String str = driverBase.getText(ele);

		assertEquals(str, "发送工作联络单", "没找到'发送工作联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.2点击"审核联络单"链接
	 */
	@Test(priority = 14,description="验证：点击'审核联络单'", dependsOnMethods = "work_contact_sheet")
	public void audit_contact_sheetLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickaudit_contact_sheetLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getAudit_Contact_Form();
		String str = driverBase.getText(ele);

		assertEquals(str, "审核工作联络单", "没找到'审核工作联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.3点击"浏览联络单"链接
	 */
	@Test(priority = 14,description="验证：点击'浏览联络单'", dependsOnMethods = "work_contact_sheet")
	public void browse_contact_sheetsLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_contact_sheetsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getBrowse_Work_Contact_Sheet();
		String str = driverBase.getText(ele);

		assertEquals(str, "浏览工作联络单", "没找到'浏览工作联络单'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 13.4点击"管理联络单"链接
	 */
	@Test(priority = 14,description="验证：点击'管理联络单'", dependsOnMethods = "work_contact_sheet")
	public void management_contact_sheetLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickmanagement_contact_sheetLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getmainWork_contact_sheet();
		String str = driverBase.getText(ele);

		assertEquals(str, "工作联络单", "没找到'工作联络单'!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
