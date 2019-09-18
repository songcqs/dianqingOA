package com.e.dianqingoa.business;

import com.a.publish.base.DriverBase;
import com.d.dianqingoa.handle.OfficialWebsitePageHandle;

public class OfficialWebsitePageBus {
	
	public OfficialWebsitePageHandle officialWebsitePageHandle;

	public OfficialWebsitePageBus(DriverBase driverBase) {
		super();
		this.officialWebsitePageHandle = new OfficialWebsitePageHandle(driverBase);
	}

	/**
	 * 点击"在线体验"进入OA
	 */
	public void clickOnlineExperience() {
		officialWebsitePageHandle.clickOnlineExperience();
	}
}
