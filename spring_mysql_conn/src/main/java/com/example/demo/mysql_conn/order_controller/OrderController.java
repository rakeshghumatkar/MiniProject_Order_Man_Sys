package com.example.demo.mysql_conn.order_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mysql_conn.foodItems.Food;
import com.example.demo.mysql_conn.order_details.Orderitems;
import com.example.demo.mysql_conn.order_repo.OrderRepo;

@RestController
public class OrderController {

	@Autowired
	private OrderRepo repo;
	
	@RequestMapping("/order")
	public List<Orderitems> getOrderDetails()
	{
		return repo.findAll();
	}
	
	@GetMapping("/order/{orderid}")
	public Orderitems getOrderDetail(@PathVariable int oid)
	{
		Orderitems ord = repo.getById(oid);
		return ord;
	}
	
	@PostMapping("/order")
	public Orderitems setOrderDetail(Orderitems ord)
	{
		return repo.save(ord); 
	}
	
	@PutMapping("/order")
	public Orderitems updateOrderDetail(Orderitems ord)
	{
		return repo.save(ord);
	}
	
	@DeleteMapping("/order/{orderid}")
	public String deleteOrderDetails(@PathVariable int orderid)
	{
		Orderitems ord = repo.getById(orderid);
		repo.delete(ord);
		return orderid+" is deleted";
	}
	
	
}
