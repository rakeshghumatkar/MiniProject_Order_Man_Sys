package com.example.demo.mysql_conn.controller;

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
import com.example.demo.mysql_conn.repo.UserRepo;
import com.example.demo.mysql_conn.user_info.UserInfo;

@RestController
public class UserController
{
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/users")
	public List<UserInfo> getAllUserDetails()
	{
		return repo.findAll();	
	}
	
	@RequestMapping("/users/{userid}")
	public UserInfo getUserDetails(@PathVariable int userid)
	{
		return repo.getById(userid);
	}
	
	@PostMapping("/users")
	public UserInfo setUserDetails(UserInfo userDetails)
	{
		return repo.save(userDetails);
	}
	
	@DeleteMapping("/users/{userid}")
	public String deleteUserDetails(@PathVariable int userid)
	{
		UserInfo user = repo.getById(userid);
		repo.delete(user);
		return userid+" is deleted";
	}
	
	@PutMapping("/users")
	public UserInfo updateUserDetails(UserInfo user)
	{
		return repo.save(user);
	}
	


}
