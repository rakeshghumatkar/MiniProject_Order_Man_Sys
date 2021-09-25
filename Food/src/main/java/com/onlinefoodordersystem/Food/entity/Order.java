package com.onlinefoodordersystem.Food.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="order_tracking_number")
    private String orderTrackingNumber;
    @Column(name="total_quantity")
    private int totalQuantity;
    @Column(name="total_price")
    private BigDecimal totalPrice;
    @Column(name="status")
    private String status;

    @CreationTimestamp
    @Column(name="date_created")
    private Date dateCreated;

    @UpdateTimestamp
    @Column(name="last_updated")
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipping_address_id", referencedColumnName = "id")
    private Address shippingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_address_id", referencedColumnName = "id")
    private Address billingAddress;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    public void add(OrderItem item){
        if(item != null){
            if(orderItems == null){
                orderItems = new ArrayList<>();
            }
            orderItems.add(item);
            item.setOrder(this);
        }
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}

	public void setOrderTrackingNumber(String orderTrackingNumber) {
		this.orderTrackingNumber = orderTrackingNumber;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

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

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderTrackingNumber=" + orderTrackingNumber + ", totalQuantity=" + totalQuantity
				+ ", totalPrice=" + totalPrice + ", status=" + status + ", dateCreated=" + dateCreated
				+ ", lastUpdated=" + lastUpdated + ", customer=" + customer + ", shippingAddress=" + shippingAddress
				+ ", billingAddress=" + billingAddress + ", orderItems=" + orderItems + "]";
	}

//	public void setCustomer(Customer customer2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setOrderTrackingNumber(String orderTrackingNumber2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setBillingAddress(Object billingAddress2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setShippingAddress(Object shippingAddress2) {
//		// TODO Auto-generated method stub
//		
//	}
    

	

}