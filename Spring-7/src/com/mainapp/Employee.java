package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	public Employee() {
		System.out.println("EMP BEAN INSTANTIATION");
	}

	// Employee object and Employee Bean Name

	@PostConstruct
	public void init() {
		System.out.println("EMP BEAN INITIALIZATION");
	}

	public void test() {
		System.out.println("EMP BEAN CUSTOM METHOD....");
	}

	@PreDestroy
	public void annoDestroy() {
		System.out.println("EMP BEAN DESTROY");
	}

}
