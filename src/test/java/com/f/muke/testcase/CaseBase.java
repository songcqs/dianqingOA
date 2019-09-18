package com.f.muke.testcase;

import com.a.publish.base.DriverBase;

public class CaseBase {
	public DriverBase initDriverBase(String browser) {
		return new DriverBase(browser);
	}
}
