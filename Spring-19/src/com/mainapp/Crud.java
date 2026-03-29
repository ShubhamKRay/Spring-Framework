package com.mainapp;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.jdbc.core.JdbcTemplate;

public class Crud {

	private JdbcTemplate jdbcTemplate; // inbuilt connection

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(int eid, String ename, String eaddress, int esalary) {

		String sql = "insert into employee(eid,ename,eaddress,esalary) values(?,?,?,?)";
		int row = jdbcTemplate.update(sql, eid, ename, eaddress, esalary);
		System.out.println(row);
	}

	public void update(int eid, String ename) {

		String sql = "update employee set ename=? where eid=?";
		int row = jdbcTemplate.update(sql, ename, eid);
		System.out.println(row);
	}

	public void delete(int eid) {

		String sql = "delete from employee where eid=?";
		int row = jdbcTemplate.update(sql, eid);
		System.out.println(row);
	}

	public void readAll() {

		String sql = "select * from employee";
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql);
		// System.out.println(queryForList);

		for (Map<String, Object> map : queryForList) {
			for (Entry<String, Object> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println();
		}
	}

	public void readAllPojoBased() {

		String sql = "select * from employee";
		List<Employee> list = jdbcTemplate.query(sql, new RowMapperImpl());
		for (Employee emp : list) {
			System.out.println(emp);
		}

	}

	public void readSingleData(int eid) {

		String sql = "select * from employee where eid=?";
		Employee emp = jdbcTemplate.queryForObject(sql, new RowMapperImpl(), eid);
		System.out.println(emp);
	}

}
