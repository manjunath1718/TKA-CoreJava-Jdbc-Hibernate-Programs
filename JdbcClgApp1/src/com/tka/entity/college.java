package com.tka.entity;

public class college {
	
	Integer clgId;
	String  clgName;
	public college() {
		
	}
	
	public Integer getClgId() {
		return clgId;
	}
	public void setClgId(Integer clgId) {
		this.clgId = clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public college(Integer clgId, String clgName) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
	}
	
	@Override
	public String toString() {
		return "college [clgId=" + clgId + ", clgName=" + clgName + "]";
	}
	

}
