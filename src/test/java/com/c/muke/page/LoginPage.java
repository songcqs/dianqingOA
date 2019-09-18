package com.c.muke.page;

import org.openqa.selenium.WebElement;

import com.a.publish.base.DriverBase;
import com.b.publish.util.BasePage;
import com.b.publish.util.ByMethod;

public class LoginPage extends BasePage {

	public LoginPage(DriverBase driver) {
		super(driver);
	}

	/*
	 * 获取用户名输入框Element
	 */
	public WebElement getUserElement() {
		// 找到properties中的userName变量
		return findElement(ByMethod.getLocator("userName"));
	}

	/*
	 * 获取密码输入框Element
	 */
	public WebElement getPasswordElement() {
		return findElement(ByMethod.getLocator("userPass"));
	}

	/*
	 * 获取自动登录Element
	 */
	public WebElement getAutoLoginElement() {
		return findElement(ByMethod.getLocator("autoSigin"));
	}

	/*
	 * 获取登录按钮
	 */
	public WebElement getLoginButtonElement() {
		return findElement(ByMethod.getLocator("buttonElement"));
	}

}
