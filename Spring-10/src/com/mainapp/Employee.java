package com.mainapp;

import java.util.Set;

public class Employee {
	
	private int eid;
	private String ename;
	private Set<String> setOfBooks;  //  private Set<Account> setOfAccount;

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
	

	public Set<String> getSetOfBooks() {
		return setOfBooks;
	}

	public void setSetOfBooks(Set<String> setOfBooks) {
		this.setOfBooks = setOfBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", setOfBooks=" + setOfBooks + "]";
	}



	

}
