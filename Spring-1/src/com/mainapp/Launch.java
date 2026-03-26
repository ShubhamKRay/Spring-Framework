package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Launch {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ClassPathResource resource = new ClassPathResource("bean.xml");

		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);

		Employee emp = (Employee) xmlBeanFactory.getBean("emp");

		emp.test();
	}

}
