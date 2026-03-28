package com.mainapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

//	@Autowired
	private Account account;
	
	@Autowired
	@Qualifier("list1")
	private List<String> listOfBooks;
	
	public Employee() {
		System.out.println("EMP BEAN INSTANTIATION: ZPC");
	}

	
//	@Autowired
	public Employee(Account account, List<String> listOfBooks) {
		super();
		System.out.println("EMP BEAN INSTANTIATION : PC");
		this.account = account;
		this.listOfBooks = listOfBooks;
	}

	public Account getAccount() {
		return account;
	}

	
//	@Autowired
	public void setAccount(Account account) {
		System.out.println("EMP SETTER CALL : ACCOUNT");
		this.account = account;
	}

	public List<String> getListOfBooks() {
		return listOfBooks;
	}

	
//	@Autowired
	public void setListOfBooks(List<String> listOfBooks) {
		System.out.println("EMP SETTER CALL : LIST");
		this.listOfBooks = listOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [account=" + account + ", listOfBooks=" + listOfBooks + "]";
	}
	
	
	
	
	
}
