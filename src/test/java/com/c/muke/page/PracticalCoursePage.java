package com.c.muke.page;

import org.openqa.selenium.WebElement;

import com.a.publish.base.DriverBase;
import com.b.publish.util.BasePage;
import com.b.publish.util.ByMethod;

public class PracticalCoursePage extends BasePage {

	public PracticalCoursePage(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取“实战课程”页面“实战课程”图片元素
	 */
	public WebElement getPracticalCourseImgElement() {
		return findElement(ByMethod.getLocator("practicalCourseImg"));
	}
}
