package com.f.dianqingoa.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.a.publish.base.DriverBase;
import com.b.publish.util.ReadProperties;
import com.c.dianqingoa.element.HompageEle;
import com.c.dianqingoa.element.ReleaseNewsEle;
import com.d.dianqingoa.handle.ReleaseNewsHandle;
import com.e.dianqingoa.business.HomepageBus;
import com.e.dianqingoa.business.OfficialWebsitePageBus;
import com.e.dianqingoa.business.ReleaseNewsBus;
import com.f.muke.testcase.CaseBase;

public class Test031_SendNews extends CaseBase {

	public DriverBase driverBase;
	public ReadProperties properties;
	public OfficialWebsitePageBus officialWebsitePageBus;
	public HompageEle hompageEle;
	public HomepageBus homepageBus;
	public ReleaseNewsBus releaseNewsBus;

	public ReleaseNewsEle releaseNewsEle;
	public ReleaseNewsHandle releaseNewsHandle;
	
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
		
		releaseNewsEle = new ReleaseNewsEle(driverBase);
		releaseNewsBus = new ReleaseNewsBus(driverBase);
	}
	
//	@Test(priority = 31,description="展开\"单位新闻管理\"")
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
//	@Test(priority = 31,description="点击\"发布新闻\"", dependsOnMethods = "unit_News_Management")
	public void publish_newsLink() {
		
		unit_News_Management();
		
		driverBase.sleep(1000);
		driverBase.switchToFrame(hompageEle.getLeftIframe());

		homepageBus.clickpublish_newsLink();

		driverBase.switchToParentFrame();// 返回默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单

		driverBase.sleep(1000);
		WebElement ele = hompageEle.getPress_release();
		String str = driverBase.getText(ele);
		driverBase.sleep(2000);
		assertEquals(str, "发布新闻", "没找到'发布新闻'!");
		driverBase.switchToParentFrame();
	}
	
	/*
	 * 发布新闻
	 */
//	@Test(priority = 31,description="发布新闻",dependsOnMethods = "publish_newsLink")
	@Test(priority = 31,description="发布新闻")
	public void ReleaseNews() {
		
		publish_newsLink();
		
		driverBase.sleep(1000);
		
		//句柄进入主页面
		driverBase.switchToFrame(hompageEle.getMainIframe());// 进入主窗口表单
		driverBase.sleep(1000);
		//输入"发布人"
		releaseNewsBus.inputPublisher("计划员");
		//选择"发布部门"(随机选择)
		int random = new Random().nextInt(102);
		driverBase.selectByIndex(releaseNewsEle.getPublishing_Department(), random);
		//选择"新闻栏目"(随机选择)
		int random2 = new Random().nextInt(5);
		driverBase.selectByIndex(releaseNewsEle.getNews_column(), random2);
		//输入"文章标题"
		long l = System.currentTimeMillis();
		WebElement titleEle = releaseNewsEle.getArticle_title();
		driverBase.sendKeys(titleEle, "Java-计算机编程语言 " + l);
		//点击 上传图片 按钮
		driverBase.clickElement(By.id("edui110_body"));
		
//		driverBase.sleep(1000);//操作隐藏元素设置其可见
//		String js = "document.querySelectorAll(\'#edui108_body\')[0].style.display=\'block\';";
//		JavascriptExecutor jse = (JavascriptExecutor) driverBase.getDriver();
//		jse.executeScript(js);
		
		driverBase.switchToFrame(By.id("edui108_iframe"));//跳转表单至弹窗
//		driverBase.clickElement(By.id("radiobutton0"));//外部图片
		//点击 选择文件
		driverBase.clickElement(By.id("file11"));
		
//		driverBase.uploadFile(By.id("file11"), "C:\\Users\\Administrator\\Desktop\\shiqu.jpg");//选择文件
		//或
	    String filePath= "F:\\图片\\地图-公交\\广州地铁线路图.jpg";
	    String executeFile= "D:\\eclipse-workspace\\OAandMuke\\lib\\uploadfile.exe"; 
	    driverBase.handleUpload("chrome", filePath, executeFile);
//	    String cmd= "\""+ executeFile+ "\""+ " "+ "\""+ "chrome"+ "\""+ " "+ "\""+ filePath+ "\"";
//	    try{
//	        Process p= Runtime.getRuntime().exec(cmd);
//	        p.waitFor();
//	    } catch(Exception e) {
//	        e.printStackTrace();
//	    }
		
	    driverBase.sleep(2000);
		driverBase.clickElement(By.id("Submit_file"));//点击 上传
		driverBase.switchToParentFrame();//回到默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());//进入主页所在表单
		//跳转到 富文本框 所在表单
		driverBase.switchToFrame(releaseNewsEle.getRich_Text_Box_iframe());
		
//		Actions actions = new Actions(driverBase.getDriver());
//		actions.sendKeys(Keys.TAB).perform(); // 鼠标通过tab要先移到富文本框中
//		actions.sendKeys(text).perform();
		
		//富文本框输入内容
		String news_content = "\r\n" + 
				"Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程 [1]  。\r\n" + 
				"Java具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点 [2]  。Java可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等 [3]  。\r\n" + 
				"";
		WebElement contentEle = releaseNewsEle.getRich_Text_Box();//获取富文本框body
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress( KeyEvent.VK_ENTER );
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driverBase.sendKeys(contentEle, news_content);//输入
		//回到默认表单
		driverBase.switchToParentFrame();
		//点击"发布新闻"
		driverBase.switchToFrame(hompageEle.getMainIframe());//进入主页所在表单
		releaseNewsBus.clickRelease_news();
		//"确定"
		driverBase.acceptAlert();
		driverBase.acceptAlert();
		
		//验证
		driverBase.switchToParentFrame();//回到默认表单
		driverBase.switchToFrame(hompageEle.getLeftIframe());//进入侧边栏表单
		homepageBus.clickbrowse_the_newsLink();//点击"浏览新闻"
		driverBase.switchToParentFrame();//回到默认表单
		driverBase.switchToFrame(hompageEle.getMainIframe());//进入主页所在表单
		List<WebElement> listEle = releaseNewsEle.getAll_News_Title();//获取所有已发布新闻的标题
		WebElement ele = listEle.get(1);//获取最新的新闻标题
		String str = ele.getText();
		System.out.println(str);
//		assertEquals(str, "Java-计算机编程语言 " + l, "没找到'Java-计算机编程语言'!");
		//点击最新的新闻标题
		ele.click();
		//句柄跳转
		driverBase.switchToCurrentPage();
		//获取最新新闻标题 展开后内容
		String news = releaseNewsBus.getNews_contentText();
		System.out.println(news);
		//获取文章中图片的src属性
		try {
			WebElement elem = releaseNewsEle.getArticle_pictures();//获取图片元素
			String attr = elem.getAttribute("src");
			System.out.println(attr);//打印出汉字是encodeURI格式
			
			String attr2 = URLDecoder.decode( attr, "UTF-8" );//对encodeURI进行解码
			System.out.println(attr2);
			assertTrue(attr2.contains("广州地铁线路图"));
			
		} catch (Exception e) {
			System.out.println("Element is not exsit!");//图片元素不存在抛出
		}
//		boolean bo = driverBase.isExsit(releaseNewsEle.getArticle_pictures());
		
		boolean bool = news.contains("Java是一门面向对象编程语言");
		assertTrue(bool, "错误！！！");
		driverBase.switchToParentFrame();//回到默认表单
	}
	
	@AfterClass
	public void afterClass() {
		driverBase.sleep(2000);
//		driverBase.closeCurrentBrowser();
		driverBase.closeAllBrowser();
	}

}
