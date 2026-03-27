package com.mainapp;

import java.util.Map;

public class Employee {
	
	private int eid;
	private String ename;
	private Map<String,String> mapOfBooks;  //  private Map<String,Account> mapOfAccount;

	public Employee() {
		System.out.println("EMP BEAN INSTANTIATION");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	
	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}
	

	public Map<String,String> getMapOfBooks() {
		return mapOfBooks;
	}

	public void setMapOfBooks(Map<String,String> mapOfBooks) {
		this.mapOfBooks = mapOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mapOfBooks=" + mapOfBooks + "]";
	}



	

}
