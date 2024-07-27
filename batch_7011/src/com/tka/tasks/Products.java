package com.tka.tasks;

public class Products {
	
	private int pId;
	private String pName;
	private double pCost;
	public Products() {
		super();
		
	}
	public Products(int pId, String pName, double pCost) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpCost() {
		return pCost;
	}
	public void setpCost(double pCost) {
		this.pCost = pCost;
	}
	@Override
	public String toString() {
		return "Products [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + "]";
	}
	
	
	

}
