package com.mainapp;

public class Student {

	static {
		System.out.println("STD BEAN LOADING");
	}

	public Student() {
		System.out.println("STD BEAN INSTANTIATED");
	}

	public void test() {
		System.out.println("STD TESTED.......");
	}

}
