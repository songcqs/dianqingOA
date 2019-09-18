package com.d.muke.handle;

import com.a.publish.base.DriverBase;
import com.c.muke.page.CoursePage;

public class CoursePageHandle {

	public DriverBase driver;
	public CoursePage coursePage;

	public CoursePageHandle(DriverBase driver) {
		super();
		this.driver = driver;
		coursePage = new CoursePage(driver);
	}

	/**
	 * 点击“课程”页面“课程”图片元素
	 */
	public void clickCourseImgElement() {
		coursePage.clickElement(coursePage.getCourseImgElement());
	}
}
