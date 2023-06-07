package com.product.model;

public class ProductModel {
	private int cid;
	private  String cname;
	private String mobile;
	private String pname;
	private double price;
	private int quantity;
	public ProductModel() {
		super();
	}
	public ProductModel(int cid, String cname, String mobile, String pname, double price, int quantity) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
