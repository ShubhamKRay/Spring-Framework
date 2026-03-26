package com.mainapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization");

		if (bean instanceof Employee) {
			System.out.println("EMPLOYEE SPECIFIC WORK.....Ex PASSWORD DECRYPT");
		} else if (bean instanceof Manager) {
			Manager manager = (Manager) bean;
			System.out.println("BEAN IS PROPERTY INSTANTIATED AND DEPENDENCIES ARE INJECTED FOR THE BEAN " + beanName);
			System.out.println(manager);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization");

		if (bean instanceof Employee) {
			System.out.println("EMPLOYEE VALIDATED SUCCESSFULLY");
		} else if (bean instanceof Manager) {
			System.out.println("MANAGER CONNECTION POOL MODIFIED");
		}

		return bean;
	}

}
