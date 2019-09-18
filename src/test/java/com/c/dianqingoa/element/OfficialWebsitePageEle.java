package com.c.dianqingoa.element;

import org.openqa.selenium.WebElement;

import com.a.publish.base.DriverBase;
import com.b.publish.util.BasePage;
import com.b.publish.util.ByMethod;

/*
 * 官网首页页面元素
 */
public class OfficialWebsitePageEle extends BasePage{

	public OfficialWebsitePageEle(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取右上角元素"在线体验"
	 */
	public WebElement getOnlineExperience() {
		return findElement(ByMethod.getLocator("onlineExperience"));
	}
	
}
