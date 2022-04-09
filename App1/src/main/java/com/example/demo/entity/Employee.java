package com.example.demo.entity;

public class Employee {

	public Employee() {}
	public Employee(String eid, String ename) {
		this.ename = ename;
		this.eid = eid;
		this.error=null;
	}
	public Employee( String error) {
		this.ename = null;
		this.eid = null;
		this.error=error;
	}

	String ename;
	String eid;
	String error;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
