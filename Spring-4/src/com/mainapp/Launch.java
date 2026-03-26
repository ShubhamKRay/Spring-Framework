package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Employee emp1 = (Employee) ac.getBean("emp");
		emp1.setTest(1000);
		emp1.test();

		Employee emp2 = (Employee) ac.getBean("emp");
		emp2.test();
	}

}
