package com.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mainapp.config.MyConfiguration;

public class Launch {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee bean = ac.getBean(Employee.class);

		int[] array = bean.getArray();
		for (int k : array)
			System.out.println(k);

		System.out.println(bean);
	}

}
