package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Manager mng = (Manager) ac.getBean("mng");

		String permission = mng.permission();

		if (permission.equals("GRANTED")) {

			Employee emp = (Employee) ac.getBean("emp");
			Student std = (Student) ac.getBean("std");

			emp.test();
			std.test();
		} else {
			System.out.println("YOU ARE NOT AUTHORIZED USER TO ACCESS EMPLOYEE AND STUDENT");
		}

	}

}
