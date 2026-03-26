package com.mainapp;

public class Employee {
	static {
		System.out.println("EMP BEAN LOADING");
	}

	public Employee() {
		System.out.println("EMP BEAN INSTANTIATED");
	}

	public void test() {
		System.out.println("TESTED...........");
	}
}
