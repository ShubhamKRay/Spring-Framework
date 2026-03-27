package com.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mainapp.config.MyConfiguration;

public class Launch {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
//		Employee bean = (Employee) ac.getBean("emp");
//		bean.test();
	
		Employee bean1 = (Employee) ac.getBean(Employee.class);
		System.out.println(bean1);
		bean1.test();
		
		
		Employee bean2 = ac.getBean(Employee.class);
		System.out.println(bean2);
		bean2.test();
		
		
		
		ac.close();
	}

}
