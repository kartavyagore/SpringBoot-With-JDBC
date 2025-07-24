package com.Kartavya.app.entity;

public class College {
	
	private int clgid;
	
	private String clg_name;
	
	private String city;

	public int getClgid() {
		return clgid;
	}

	public void setClgid(int clgid) {
		this.clgid = clgid;
	}

	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public College(int clgid, String clg_name, String city) {
		super();
		this.clgid = clgid;
		this.clg_name = clg_name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "College [clgid=" + clgid + ", clg_name=" + clg_name + ", city=" + city + ", getClgid()=" + getClgid()
				+ ", getClg_name()=" + getClg_name() + ", getCity()=" + getCity() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
