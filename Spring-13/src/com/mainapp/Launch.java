package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Employee employee = (Employee) ac.getBean("employee");
		System.out.println(employee);
		
		Employee2 employee2 = (Employee2) ac.getBean("employee2");
		System.out.println(employee2);

		ac.close();
	}

}
