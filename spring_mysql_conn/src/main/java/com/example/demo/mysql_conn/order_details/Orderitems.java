package com.example.demo.mysql_conn.order_details;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orderitems {
	
	@Id
	@Column(name="orderid")
	private int orderid;
	@Column(name="orderdetail")
	private String orderdetail;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(String orderdetail) {
		this.orderdetail = orderdetail;
	}
	@Override
	public String toString() {
		return "Orderitems [orderid=" + orderid + ", orderdetail=" + orderdetail + "]";
	}
	

}
