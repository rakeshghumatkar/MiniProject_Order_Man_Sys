package com.example.demo.mysql_conn.foodItems;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name= "fooditems")
public class Food {
	@Id
	@Column(name="foodid")
	private int foodid;
	@Column(name="foodname")
	private String foodname;
	@Column(name="price")
	private int price;
	@Column(name="weight")
	private float weight;
	@Column(name="des")
	private String des;
	
	
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return des;
	}
	public void setDescription(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "FoodItems [foodid=" + foodid + ", foodname=" + foodname + ", price=" + price + ", weight=" + weight
				+ ", description=" + des + "]";
	}
	

}
