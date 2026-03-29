package com.mainapp;

import org.springframework.stereotype.Component;

@Component("test")
public class Test {

	public String doTest() {
		return "test";
	}

	public int checkSalary() {
		return 100;
	}
}
