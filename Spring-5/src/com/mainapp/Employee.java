package com.mainapp;

import java.util.UUID;

public class Employee {
	
	private String id;  //dependency
	private Account account; //Spring create & inject
	
	public void setAccount(Account account) {
		this.account=account;
	}

	public Employee(String id) {
		super();
		System.out.println("EMP BEAN INSTANTIATED THROUGH PC");
		this.id = id;
	}

	

	public void setId(String id) {
		this.id = id;
	}

	public Employee() {
		System.out.println("EMP BEAN INSTANTIATED");
	}
	
	public void test() {
		System.out.println("EMP TESTED....."+id);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", account=" + account + "]";
	}
	
	
	
	public static Employee getObject() {
		
		Employee employee = new Employee();
		employee.setId(UUID.randomUUID().toString());
		return employee;
	}
	
		
	

}
