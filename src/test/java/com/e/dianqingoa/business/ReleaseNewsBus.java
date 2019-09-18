package com.e.dianqingoa.business;

import com.a.publish.base.DriverBase;
import com.d.dianqingoa.handle.ReleaseNewsHandle;

public class ReleaseNewsBus {
	public ReleaseNewsHandle releaseNewsHandle;

	public ReleaseNewsBus(DriverBase driverBase) {
		super();
		releaseNewsHandle = new ReleaseNewsHandle(driverBase);
	}

	/**
	 * 1."发布人"输入框输入内容
	 */
	public void inputPublisher(String str) {
		releaseNewsHandle.inputPublisher(str);
	}
	
	/**
	 * 点击"发布新闻"
	 */
	public void clickRelease_news() {
		releaseNewsHandle.clickRelease_news();
	}
	
	/**
	 * 获取最新新闻标题 展开后内容
	 */
	public String getNews_contentText() {
		return releaseNewsHandle.getNews_contentText();
	}
}
