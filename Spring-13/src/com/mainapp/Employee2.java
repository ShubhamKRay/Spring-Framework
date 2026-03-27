package com.mainapp;

import java.util.List;

public class Employee2 {

	private int eid;
	private Account account;
	private Car car;
	private List<String> listOfBooks;

	public Employee2() {

		// TODO Auto-generated constructor stub
	}

	public Employee2(Account account, Car car, List<String> listOfBooks) {

		super();

		this.account = account;
		this.car = car;
		this.listOfBooks = listOfBooks;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<String> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", account=" + account + ", car=" + car + "]";
	}

}
