package com.mainapp;

import java.util.List;

public class Employee {
	
	private int eid;
	private String ename;
	private List<String> listOfBooks;  // private List<Account> listOfAccount;

	public Employee() {
		System.out.println("EMP BEAN INSTANTIATION");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public List<String> getListOfBooks() {
		return listOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", listOfBooks=" + listOfBooks + "]";
	}



	

}
