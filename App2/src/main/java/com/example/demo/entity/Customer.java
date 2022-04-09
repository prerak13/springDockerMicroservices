package com.example.demo.entity;

public class Customer {
	String cname;
	String cid;
	String error;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Customer( String error) {
		super();
		this.cname = null;
		this.cid = null;
		this.error = error;
	}
	public Customer(String cname, String cid) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.error = null;
	}
	public Customer() {
	}
	
	
}
