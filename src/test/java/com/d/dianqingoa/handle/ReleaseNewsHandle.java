package com.d.dianqingoa.handle;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.a.publish.base.DriverBase;
import com.b.publish.util.ByMethod;
import com.c.dianqingoa.element.ReleaseNewsEle;

public class ReleaseNewsHandle {
	public DriverBase driver;
	public ReleaseNewsEle releaseNewsEle;
	
	public ReleaseNewsHandle(DriverBase driver) {
		super();
		this.driver = driver;
		releaseNewsEle = new ReleaseNewsEle(driver);
	}
	
	//---------------------------点---------------------------------//
	
	/**
	 * 1."发布人"输入框输入内容
	 */
	public void inputPublisher(String str) {
		driver.setElementValue(releaseNewsEle.getPublisher(), str);
	}
	
	/**
	 * 2.点击"录入时间"选择图标
	 */
	public void clickEntry_time() {
		driver.clickElement(releaseNewsEle.getEntry_time());
	}
	
	/**
	 * 点击"发布新闻"
	 */
	public void clickRelease_news() {
		driver.clickElement(releaseNewsEle.getRelease_news());
	}
	

	/**
	 * 获取最新新闻标题 展开后内容
	 */
	public String getNews_contentText() {
		return driver.getText(releaseNewsEle.getNews_content());
	}
	
}
