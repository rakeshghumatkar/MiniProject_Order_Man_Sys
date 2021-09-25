package com.onlinefoodordersystem.Food.dto;

import java.util.List;

import org.apache.tomcat.jni.Address;

import com.onlinefoodordersystem.Food.entity.Customer;
import com.onlinefoodordersystem.Food.entity.Order;
import com.onlinefoodordersystem.Food.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private List<OrderItem> orderItems;
//	public Order getOrder() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public List<OrderItem> getOrderItems() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Object getBillingAddress() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Object getShippingAddress() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Customer getCustomer() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	@Override
	public String toString() {
		return "Purchase [customer=" + customer + ", shippingAddress=" + shippingAddress + ", billingAddress="
				+ billingAddress + ", order=" + order + ", orderItems=" + orderItems + "]";
	}
    
    
}
