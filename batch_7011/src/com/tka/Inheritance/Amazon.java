package com.tka.Inheritance;

public class Amazon {
	
	protected int productId;
	protected int productPrice;
	protected int productQty;
	
	public Amazon(String shopName) {
		System.out.println("Shop name "+shopName);
	}
	
	public void setData(int productId,int productPrice,int productQty) {
		this.productId=productId;
		this.productPrice=productPrice;
		this.productQty=productQty;
	}
	

}
