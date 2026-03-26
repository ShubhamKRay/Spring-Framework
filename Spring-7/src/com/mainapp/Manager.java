package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Manager {

	public Manager() {
		System.out.println("MANAGER BEAN INSTANTIATION");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("MANAGER BEAN INITIALIZATION");
	}
	
	
	public void test() {
		System.out.println("MANAGER BEAN CUSTOM METHOD.....");
	}
	
	
	@PreDestroy
	public void annoDestroy() {
		System.out.println("MANAGER BBEAN DESTROY");
	}
	
}
