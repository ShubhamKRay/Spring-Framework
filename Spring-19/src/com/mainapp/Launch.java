package com.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mainapp.config.MyConfiguration;

public class Launch {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);

		Crud bean = (Crud) ac.getBean("crud");
//		bean.insert(18, "raju", "add1", 1000);
//		 bean.update(16, "kaju");
//		 bean.delete(16);
//		 bean.readAll();
//		 bean.readAllPojoBased();
		bean.readSingleData(18);

	}

}
