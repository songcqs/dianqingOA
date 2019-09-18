package com.f.muke.testcase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.a.publish.base.DriverBase;
import com.b.publish.util.HandleCookie;
import com.b.publish.util.ReadProperties;
import com.b.publish.util.RetryListener;
import com.b.publish.util.TestngListener;
import com.c.muke.page.ApeAskPage;
import com.c.muke.page.CoursePage;
import com.c.muke.page.EmploymentClassesPage;
import com.c.muke.page.HomePage;
import com.c.muke.page.NotesPage;
import com.c.muke.page.PracticalCoursePage;
import com.c.muke.page.SpecialColumnPage;
import com.d.muke.handle.CoursePageHandle;
import com.e.muke.bussiness.CoursePageBus;
import com.e.muke.bussiness.HomePageBus;
import com.e.muke.bussiness.LoginPageBus;

/*
 * 页面面跳转
 */
@Listeners({ TestngListener.class, RetryListener.class })
public class SuiteTest003_SwitchTitle {

	public SuiteCookieLogin suiteCookieLogin;

	public DriverBase driver;
	public ReadProperties properties;

	public LoginPageBus loginbus;
	public HandleCookie handleCookie;

	public HomePage homePage;
	public HomePageBus homePageBus;

	public CoursePage coursePage;
	public CoursePageHandle coursePageHandle;
	public CoursePageBus coursePageBus;

	public PracticalCoursePage practicalCoursePage;

	public EmploymentClassesPage employmentClassesPage;

	public SpecialColumnPage specialColumnPage;

	public ApeAskPage apeAskPage;

	public NotesPage notesPage;


	@BeforeClass
//	@BeforeTest
	public void beforeClass() {
		suiteCookieLogin = new SuiteCookieLogin();
		suiteCookieLogin.cookieLogin();
		this.driver = suiteCookieLogin.driverBase;
		homePageBus = new HomePageBus(driver);
		homePage = new HomePage(driver);
		coursePage = new CoursePage(driver);
		practicalCoursePage=new PracticalCoursePage(driver);
		employmentClassesPage = new EmploymentClassesPage(driver);
		specialColumnPage = new SpecialColumnPage(driver);
		apeAskPage = new ApeAskPage(driver);
		notesPage = new NotesPage(driver);
	}

	// 从"首页"跳转到"课程"
	@Test
	public void test01_switchCourse() {
		homePageBus.clickCourseElement();
		boolean bool = homePage.isExsit(coursePage.getCourseImgElement());
		assertTrue(bool, "跳转转失败！！！");
		driver.returnBackPage();//页面返回
	}

	// 从"首页"跳转到"实战课程"
	@Test
	public void test02_switchPracticalCourse() {
		homePageBus.clickPracticalCourse();
		boolean bool = homePage.isExsit(practicalCoursePage.getPracticalCourseImgElement());
		assertTrue(bool, "跳转转失败！！！");
		driver.returnBackPage();
	}

	// 从"首页"跳转到"就业班"
	@Test
	public void test03_switchEmploymentClasses() {
		homePageBus.clickEmploymentClassesElement();
		boolean bool = homePage.isExsit(employmentClassesPage.getEmploymentClassesImgElement());
		assertTrue(bool, "跳转转失败！！！");
		driver.returnBackPage();
	}

	// 从"首页"跳转到"专栏"
	@Test
	public void test04_switchSpecialColumn() {
		homePageBus.clickSpecialColumnElement();
		boolean bool = homePage.isExsit(specialColumnPage.getProgramDevelopmentImgElement());
		assertTrue(bool, "跳转转失败！！！");
		driver.returnBackPage();
	}

	// 从"首页"跳转到"猿问"
	@Test
	public void test05_switchApeAsk() {
		homePageBus.clickApeAskElement();
		boolean bool = homePage.isExsit(apeAskPage.getApeAskImgElement());
		assertTrue(bool, "跳转转失败！！！");
		driver.returnBackPage();
	}

	// 从"首页"跳转到"手记"
	@Test
	public void test06_switchNotes() {
		homePageBus.clickNotesElement();
		boolean bool = homePage.isExsit(notesPage.getNotesImgElement());
		assertTrue(false, "跳转转失败！！！");
		driver.returnBackPage();
	}

	@AfterClass
//	@AfterTest
	public void afterClass() {

		driver.sleep(2000);
		driver.closeCurrentBrowser();
	}
}
