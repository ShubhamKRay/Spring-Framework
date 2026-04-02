package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeCrud;

@SpringBootApplication
public class Springboot2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Springboot2Application.class, args); // Springboot
		EmployeeCrud bean = ac.getBean(EmployeeCrud.class); // activate

//		bean.save(new EmployeeEntity(11, "raju", "add1", 1100));
//		bean.save(new EmployeeEntity(12, "kaju", "add2", 2100));
//		bean.save(new EmployeeEntity(13, "maju", "add3", 3100));
//
//		List<EmployeeEntity> list1 = bean.findAll();
//		for (EmployeeEntity emp : list1)
//			System.out.println(emp);
//
//		
//		
//		
//		List<EmployeeEntity> list2 = bean.findAll();
//		for (EmployeeEntity emp : list2)
//			System.out.println(emp);
//
//		
//		
//		List<EmployeeEntity> list = bean.findAll(Sort.by("esalary").descending());
//		System.out.println(list);

//		Optional<EmployeeEntity> byId = bean.findById(12);
//		EmployeeEntity employeeEntity = byId.get();
//		System.out.println(employeeEntity);

//		bean.deleteById(13);
//		bean.deleteAll();

//		int saveMyData = bean.saveMyData(111, "shubh", "noida", 51000);
//		System.out.println(saveMyData);

//		List<EmployeeEntity> myData = bean.readMyData();
//		System.out.println(myData);

//		List<EmployeeEntity> myAllData = bean.readMyAllData();
//		System.out.println(myAllData);

//		List<EmployeeEntity> byEsalary = bean.findByEsalary(1100);
//		System.out.println(byEsalary);

		List<EmployeeEntity> byEsalaryLessThan = bean.findByEsalaryLessThan(3100);
		System.out.println(byEsalaryLessThan);

		System.out.println("TEST.......");

	}

}
