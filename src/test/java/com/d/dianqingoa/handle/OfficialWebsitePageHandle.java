package com.d.dianqingoa.handle;

import com.a.publish.base.DriverBase;
import com.c.dianqingoa.element.OfficialWebsitePageEle;

public class OfficialWebsitePageHandle {
	
	public DriverBase driver;
	public OfficialWebsitePageEle officialWebsitePageEle;
	
	public OfficialWebsitePageHandle(DriverBase driver) {
		super();
		this.driver = driver;
		officialWebsitePageEle=new OfficialWebsitePageEle(driver);
	}
	
	/**
	 * 点击"在线体验"
	 */
	public void clickOnlineExperience() {
		officialWebsitePageEle.clickElement(officialWebsitePageEle.getOnlineExperience());
	}
}

