package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{

	public Employee() {
		System.out.println("EMP BEAN INSTANTIATION");
	}
	

//	//initialization
//	public void xmlInit() {
//		System.out.println("RESOURCE ALLOCATION");
//	}
		
	
	
//	@PostConstruct
//	public void annoInit() {
//		System.out.println("RESOURCE ALLOCATION");
//	}
	
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("RESOURCE ALLOACTION");
	}
	
	
	public void test() {
		System.out.println("EMP BEAN TESTED....");
	}

	//destroy
//	public void xmlDestroy(){
//		System.out.println("RESOURCE De-ALLOCATION");
//	}
	
	
 
//	@PreDestroy
//	public void annoDestroy() {
//		System.out.println("RESOURCE De-ALLOCATION");
//	}
	
	
	@Override
	public void destroy() throws Exception{
		System.out.println("RESOURCE De-ALLOCATION");
	}
	
}
