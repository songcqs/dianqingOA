package com.e.muke.bussiness;

import com.a.publish.base.DriverBase;
import com.d.muke.handle.CoursePageHandle;

public class CoursePageBus {

	public CoursePageHandle coursePageHandle;

	public CoursePageBus(DriverBase driverBase) {
		super();
		this.coursePageHandle = new CoursePageHandle(driverBase);
	}

}
