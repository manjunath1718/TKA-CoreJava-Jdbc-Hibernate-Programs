package com.tka.Inheritance;

public class BrandOfElectronics extends Electronics {

	protected String brandName;
	protected int warranty;
	
	public BrandOfElectronics() {
		super();
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
	

}
