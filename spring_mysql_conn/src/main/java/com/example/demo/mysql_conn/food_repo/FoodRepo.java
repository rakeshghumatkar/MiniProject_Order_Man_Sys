package com.example.demo.mysql_conn.food_repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.mysql_conn.foodItems.Food;

public interface FoodRepo extends JpaRepository<Food, Integer>
{

}
