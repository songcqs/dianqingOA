package com.f.dianqingoa.testcase;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AlertTest {
	
	WebDriver driver = null;
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"D:/Program Files/Google/Chrome/Application/chromedriver.exe");
		 driver = new ChromeDriver();
	}

	@Test
	public void test() throws InterruptedException, AWTException {
		driver.navigate().to("http://www.clicksun.cn/");//打开url
		driver.manage().window().maximize();//最大化窗口
		driver.findElement(By.linkText("在线体验")).click();//点击"在线体验"按钮
		Thread.sleep(1000);
		
//		switchCurrentPage();//指向当前页面(点晴OA主页)
		switchToCurrentWindow();
		
		driver.switchTo().frame(driver.findElement(By.id("left_menu")));//进入侧边栏表单
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("img[src$='photos.png']")).click();//点击"点请管理之道"
		driver.switchTo().defaultContent();//回到默认表单
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.id("show_dilog_url")));//进入弹窗侧边栏表单
		driver.switchTo().frame(driver.findElement(By.id("csun")));//进入弹窗侧边栏表单
		
		//悬停"点晴进销存管理系统"
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("li[onmouseover*=\"'1'\"]"))).perform();
		
		driver.findElement(By.cssSelector("a[href$='try.html?to=jxc']")).click();//点击"开始体验"

//		Robot robot = new Robot();
//		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);  //模拟按下ALT键
//		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);  //释放按键	
		
//		driver.switchTo().defaultContent();//回到默认表单
//		driver.findElement(By.cssSelector("img[src$='background_button_leave.gif']")).click();//关闭原网页弹窗
//		driver.close();
		
//		driver.switchTo().defaultContent();//回到默认表单
		Thread.sleep(3000);

//		switchCurrentPage();//指向当前页面(点晴JXC子系统页面)
		switchToWindow_Title("深圳市点晴信息技术有限公司点晴MIS管理信息系统");
		
		Thread.sleep(3000);
		System.out.println("driver.getCurrentUrl();:"+driver.getCurrentUrl());
		
//		driver.switchTo().alert().accept();//没起作用
//		try{
//			Alert alert =driver.switchTo().alert();  //使用driver.switchTo().alert()方法获取到alert对象
//			Assert.assertEquals("欢迎体验点晴JXC管理信息系统！", alert.getText()); //断言弹框文本是否和预期一致
//			alert.accept(); //点击确定 
//			// alert.dismiss();  //点击取消
//		}catch(NoAlertPresentException exception){ //弹框未显示，则跑出异常
//			Assert.fail("尝试操作的alert框没有被找到");
//			exception.printStackTrace();
//		}
		
//		Actions action2 = new Actions(driver);
//		action2.sendKeys(Keys.ENTER).sendKeys(Keys.NULL); //没起作用
		
//		action2.sendKeys(Keys.chord(Keys.ENTER)).sendKeys(Keys.chord(Keys.NULL)); //没起作用
		
//		action2.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();//报错,仅对修改键有意义（Shift、Ctrl、Alt和Meta）
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);  //模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);  //释放按键	
//		
		driver.switchTo().frame(driver.findElement(By.id("left_menu")));
		WebElement ele = driver.findElement(By.xpath("//td[text()='点晴JCX子系统']"));
		String str = ele.getText();
//		Assert.assertEquals(str,"点晴JCX子系统");
		assertEquals(str, "点晴JCX子系统", "失败！！！");
		
//		System.out.println("Robot robot");
//		System.out.println("driver.getCurrentUrl()2:"+driver.getCurrentUrl());
		
//		File file = new File("lib", "jacob-1.15-M4-x86.dll"); //path to the jacob dll
//		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
//		AutoItX x = new AutoItX();
//		x.winActivate(winTitle);
//		x.winWaitActive(winTitle,"",10);
//		x.winClose(winTitle);
//
//		if(x.winExists("来自 "+URL+" 的页面说:")) {
//		x.winActivate("来自 "+URL+" 的页面说:");
//		x.winWaitActive("来自 "+URL+" 的页面说:","",10);
//		
//		if("true".equalsIgnoreCase(goToProperties)) {
//		selenium.keyPressNative(""+java.awt.event.KeyEvent.VK_ENTER);
//		}
//		else {
//		x.winClose("来自 "+URL+" 的页面说:");
//		}
//		Thread.sleep(2000);
	}
	
	@Test
	public void test2() throws AWTException {
		driver.navigate().to("http://clicksun.net:311/mis/csun.html?to=jxc");//打开url
		driver.manage().window().maximize();//最大化窗口
		
//		Actions action2 = new Actions(driver);
//		action2.sendKeys(Keys.ENTER).sendKeys(Keys.NULL); //没起作用
		
//		action2.sendKeys(Keys.chord(Keys.ENTER)).sendKeys(Keys.chord(Keys.NULL)); //没起作用
		
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);  //模拟按下ALT键
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);  //释放按键	//起作用了
		
	}

	@AfterMethod
	public void afterMethod() {
	}
	
	/**
	 * WebDriver切换到当前窗口/当前页
	 */
	public void switchToCurrentWindow() {
		// 先获取当前窗口的句柄
		String current_handle = driver.getWindowHandle();
		// 打开新窗口后获取所有窗口的句柄
		Set<String> all_handles = driver.getWindowHandles();
		for (String string : all_handles) {
			System.out.println(string);
		}
		// 通过循环判断是不是当前的窗口句柄
		Iterator<String> it = all_handles.iterator();//返回此集合中元素的迭代器
		while (it.hasNext()) {
//			System.out.println("driver.getTitle():"+driver.getTitle());
			if (it.next() == current_handle) {
				continue;
			}else {
				// 跳入新窗口
				WebDriver new_driver = driver.switchTo().window(it.next());
			}
			// 新窗口的driver为new_driver，若要跳回之前的窗口/父窗口/父页面，则使用如下：
//			driver.switchTo().window(current_handle);
		}
	}
	/**
	 * WebDriver切换到当前窗口/当前页
	 */
	public void switchCurrentPage() {
		String handle = driver.getWindowHandle();
		for (String tempHandle : driver.getWindowHandles()) {
			if (tempHandle.equals(handle)) {
				driver.close();
			} else {
				driver.switchTo().window(tempHandle);
			}
		}
	}
	/*
	 * 获取当前窗口
	 */
	public String getWindowHandle() {
		String currentWindow = driver.getWindowHandle();
		return currentWindow;
	}
	/*
	 * 获取当前系统窗口list
	 */
	public List<String> getWindowsHandles() {
		// Set里面不允许有重复的元素,检索元素效率低下，删除和插入效率高，插入和删除不会引起元素位置改变；
		Set<String> winHandels = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(winHandels);
		return handles;
	}
	/*
	 * 切换windows窗口
	 */
	public void switchWindows(String name) {
		driver.switchTo().window(name);
	}
	/*
	 * 根据title切换新窗口
	 */
	public boolean switchToWindow_Title(String windowTitle) {
		boolean flag = false;
		try {
			String currentHandle = getWindowHandle();
			List<String> handles = getWindowsHandles();
			for (String s : handles) {
				if (s.equals(currentHandle))
					continue;
				else {
					switchWindows(s);
					if (driver.getTitle().contains(windowTitle)) {
						flag = true;
						System.out.println("切换windows成功: " + windowTitle);
						break;
					} else
						continue;
				}
			}
		} catch (NoSuchWindowException e) {
			System.out.println("Window: " + windowTitle + " 没找到!!!" + e.fillInStackTrace());
			flag = false;
		}
		return flag;
	}
}
