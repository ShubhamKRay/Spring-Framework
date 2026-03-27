package com.mainapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.mainapp.Employee;


@Configuration
@ComponentScan(basePackages = {"com.mainapp"})
public class MyConfiguration {

	@Bean(initMethod = "init" , destroyMethod = "destroy")
	@Lazy
	@Scope("prototype")
	public Employee getEmployee() {
		System.out.println("CUSTOM LOGIC");
		return new Employee();
	}
}
