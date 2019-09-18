package com.e.muke.bussiness;

import com.a.publish.base.DriverBase;
import com.c.muke.page.LoginPage;
import com.d.muke.handle.LoginPageHandle;

public class LoginPageBus {

	public DriverBase driverBase;
	public LoginPageHandle loginPageHandle;
	public LoginPage loginPage;

	public LoginPageBus(DriverBase driverBase) {
		this.driverBase = driverBase;
		loginPage = new LoginPage(driverBase);
		loginPageHandle = new LoginPageHandle(driverBase);
	}

	public void login(String username, String password) {

		// 如果能够识别二维码&用户名登录切换按钮，那么就代表登录页面存在，就可以进行输入用户名，密码等操作
		if (loginPageHandle.assertLoginPage()) {

			// 输入用户名
			loginPageHandle.sendKeysUserName(username);
			// 输入密码
			loginPageHandle.sendKeysPassword(password);
			// 点击自动登录
			loginPageHandle.clickAutoSigin();
			// 点击登录
			loginPageHandle.clickLoginButton();
		} else {
			System.out.println("页面不存在或者状态不正确");
		}
	}
}
