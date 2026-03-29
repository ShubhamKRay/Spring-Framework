package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Crud bean = (Crud) ac.getBean("crud");
//		 bean.insert(16,"raju","add1",1000);
//		 bean.update(16, "shubh");
//		 bean.delete(16);
//		 bean.readAll();
//		 bean.readAllPojoBased();
		bean.readSingleData(14);

	}

}
