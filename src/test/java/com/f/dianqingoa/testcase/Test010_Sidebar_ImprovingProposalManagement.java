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

public class Test010_Sidebar_ImprovingProposalManagement extends CaseBase {

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
	 * 9.点击"改善提案管理"
	 */
	@Test(priority = 10,description="验证：展开'改善提案管理'")
	public void improving_Proposal_Management() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());
		homepageBus.clickimproving_Proposal_Management();
		String i_want_to_submit_a_proposal = driverBase.getText(hompageEle.geti_want_to_submit_a_proposal());
		assertEquals(i_want_to_submit_a_proposal, "我要提交提案", "没找到'我要提交提案'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 9.1点击"我要提交提案"链接
	 */
	@Test(priority = 10,description="验证：点击'我要提交提案'", dependsOnMethods = "improving_Proposal_Management")
	public void i_want_to_submit_a_proposalLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clicki_want_to_submit_a_proposalLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getAdditional_Improvement_Proposals();
		String str = driverBase.getText(ele);

		assertEquals(str, "新增改善提案", "没找到'新增改善提案'!");
		driverBase.switchToParentFrame();
	}

	/*
	 * 9.2点击"提案浏览及反馈"链接
	 */
	@Test(priority = 10,description="验证：点击'提案浏览及反馈'", dependsOnMethods = "improving_Proposal_Management")
	public void proposal_Browsing_and_FeedbackLink() {
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickproposal_Browsing_and_FeedbackLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		WebElement ele = hompageEle.getImprove_proposal_browsing();
		String str = driverBase.getText(ele);

		assertEquals(str, "改善提案浏览", "没找到'改善提案浏览'!");
		driverBase.switchToParentFrame();
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}
}
