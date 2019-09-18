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
import com.d.dianqingoa.handle.HompageHandle;
import com.e.dianqingoa.business.HomepageBus;
import com.e.dianqingoa.business.OfficialWebsitePageBus;
import com.f.muke.testcase.CaseBase;

public class Test015_Sidebar_PartyMembersWorld extends CaseBase {

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
	 * 14.点击"个人备忘录"
	 */
	@Test(priority = 15,description="展开：点击'个人备忘录'")
	public void personal_Memorandum() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickpersonal_Memorandum();
		String additional_memorandum = driverBase.getText(hompageEle.getadditional_memorandum());
		assertEquals(additional_memorandum, "增加备忘录", "没找到'增加备忘录'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 14.1点击"增加备忘录"链接
	 */
	@Test(priority = 15,description="验证：点击'增加备忘录'", dependsOnMethods = "personal_Memorandum")
	public void additional_memorandumLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());// 进入侧边栏表单

		homepageBus.clickadditional_memorandumLink();

		driverBase.switchToParentFrame();// 返回默认表单

		driverBase.switchToFrame(hompageEle.getpopupIframe());// 进入弹窗表单

		WebElement ele = hompageEle.getAdditional_Personal_Memorandum();
		String str = driverBase.getText(ele);

		assertEquals(str, "新增个人备忘录", "没找到'新增个人备忘录'!");
		
		homepageBus.closeadditional_memorandumWindow();
		driverBase.switchToParentFrame();
	}

	/*
	 * 14.2点击"浏览备忘录"链接
	 */
	@Test(priority = 15,description="验证：点击'浏览备忘录'", dependsOnMethods = "personal_Memorandum")
	public void browse_the_MemorandumLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickbrowse_the_MemorandumLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getPersonal_Diaries_Memo_Browsing();
		String str = driverBase.getText(ele);

		assertEquals(str, "个人日记＆备忘录浏览", "没找到'个人日记＆备忘录浏览'!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
