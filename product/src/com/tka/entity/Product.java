package com.tka.entity;

public class Product {
	
	private Integer pId;
	private String pName;
	private Double pPrice;
	
	
	public Product() {
		
	}

	public Product(Integer pId, String pName,  Double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;		
		this.pPrice = pPrice;
	}


	public Integer getpId() {
		return pId;
	}


	public void setpId(Integer pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	


	public Double getpPrice() {
		return pPrice;
	}


	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}


	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName +  ", pPrice=" + pPrice + "]";
	}
	
	
	
	

}
