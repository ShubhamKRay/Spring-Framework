package com.mainapp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("#{42+82}")
	private int eid;

//	@Value("#{'raju'}")
//	@Value("#{test.doTest()}")
//	@Value("#{T(com.mainapp.TestStatic).doTestStatic() }")

	@Value("#{ test.checkSalary()>500 ? 'Valid' : 'invalid'   }")
	private String ename;

	@Value("#{  {'b1','b2','b3'}  }")
	private List<String> list;

	@Value("#{   {'b1','b2','b3' }   }")
	private Set<String> set;

	@Value("#{   {'key1':'b1','key2':'b2','key3':'b3'}   }")
	private Map<String, String> map;

	@Value("#{ new int[]{10,20,30} }")
	private int[] array;

	@Value("#{environment['db.url']}")
	private String url;

	public Employee() {

		System.out.println("EMP BEAN INST : ZPC");
	}

	public Employee(int eid, String ename, List<String> list, Set<String> set, Map<String, String> map, int[] array,
			String url) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.list = list;
		this.set = set;
		this.map = map;
		this.array = array;
		this.url = url;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		System.out.println("EMP BEAN SETTER : eid");
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("EMP BEAN SETTER : ename");
		this.ename = ename;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("EMP BEAN SETTER : url");
		this.url = url;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", list=" + list + ", set=" + set + ", map=" + map
				+ ", array=" + array + ", url=" + url + "]";
	}

}
