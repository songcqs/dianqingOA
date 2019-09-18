package com.e.muke.bussiness;

import com.a.publish.base.DriverBase;
import com.d.muke.handle.HomePageHandle;

public class HomePageBus {

	public HomePageHandle homePageHandle;

	public HomePageBus(DriverBase driverBase) {
		super();
		this.homePageHandle = new HomePageHandle(driverBase);
	}

	/**
	 * 点击退出按钮
	 */
	public void clickLogout() {
		homePageHandle.clickLogout();
	}

	/**
	 * 根据用户名判断登陆信息是否正确
	 */
	public Boolean AssertLogin(String username) {
		if (homePageHandle.getUserName().equals(username)) {
			return true;
		}
		return false;
	}

	/**
	 * 点击 首页右上角"课程"元素
	 */
	public void clickCourseElement() {
		homePageHandle.clickCourseElement();
	}

	/**
	 * 点击 首页右上角"实战课程"按钮元素element
	 */
	public void clickPracticalCourse() {
		homePageHandle.clickPracticalCourseElement();
	}

	/**
	 * 点击 首页右上角"就业班"元素
	 */
	public void clickEmploymentClassesElement() {
		homePageHandle.clickEmploymentClassesElement();
	}

	/**
	 * 点击 首页右上角"专栏"元素
	 */
	public void clickSpecialColumnElement() {
		homePageHandle.clickSpecialColumnElement();
	}

	/**
	 * 点击 首页右上角"猿问"元素
	 */
	public void clickApeAskElement() {
		homePageHandle.clickApeAskElement();
	}

	/**
	 * 点击 首页右上角"手记"元素
	 */
	public void clickNotesElement() {
		homePageHandle.clickNotesElement();
	}
}
