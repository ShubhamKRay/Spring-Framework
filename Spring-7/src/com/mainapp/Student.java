package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	
	public Student() {
		System.out.println("STUDENT BEAN INSTANTIATION");
	}

	@PostConstruct
	public void init() {
		System.out.println("STUDENT BEAN INITIALIZATION");
	}


	public void test() {
		System.out.println("STUDENT BEAN CUSTOM METHOD....");
	}
	
	@PreDestroy
	public void annoDestroy() {
		System.out.println("STUDENT BEAN DESTROY");
	}


}
