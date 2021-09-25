package com.example.demo.mysql_conn.food_controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mysql_conn.foodItems.Food;
import com.example.demo.mysql_conn.food_repo.FoodRepo;


@RestController
public class FoodController {
	@Autowired
	private FoodRepo repo;
	
	@GetMapping("/food")
	public List<Food> getAllFoodDetails()
	{
		return repo.findAll();	
	}
	
	@RequestMapping("/food/{foodid}")
	public Food getFoodDetails(@PathVariable int foodid)
	{
		return repo.getById(foodid);
	}
	
	@PostMapping("/food")
	public Food setFoodDetails(Food foodDetails)
	{
		return repo.save(foodDetails);
	}
	
	@DeleteMapping("/food/{foodid}")
	public String deleteUserDetails(@PathVariable int foodid)
	{
		Food food = repo.getById(foodid);
		repo.delete(food);
		return foodid+" is deleted";
	}
	
	@PutMapping("/food")
	public Food updateUserDetails(Food food)
	{
		return repo.save(food);
	}
	

}
