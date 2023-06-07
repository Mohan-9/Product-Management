package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productmanagementservice")
public class Product {
	@Id
	private int cid;
	private  String cname;
	private String mobile;
	private String pname;
	private double price;
	private int quantity;
	private double total;
	private double discount;
	private double servicecharges;
	private double totalbill;
	public Product() {
		super();
	}
	public Product(int cid, String cname, String mobile, String pname, double price, int quantity, double total,
			double discount, double servicecharges, double totalbill) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.discount = discount;
		this.servicecharges = servicecharges;
		this.totalbill = totalbill;
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getServicecharges() {
		return servicecharges;
	}
	public void setServicecharges(double servicecharges) {
		this.servicecharges = servicecharges;
	}
	public double getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}
	@Override
	public String toString() {
		return "Product [cid=" + cid + ", cname=" + cname + ", mobile=" + mobile + ", pname=" + pname + ", price="
				+ price + ", quantity=" + quantity + ", total=" + total + ", discount=" + discount + ", servicecharges="
				+ servicecharges + ", totalbill=" + totalbill + "]";
	}
	
	
	
	
}
