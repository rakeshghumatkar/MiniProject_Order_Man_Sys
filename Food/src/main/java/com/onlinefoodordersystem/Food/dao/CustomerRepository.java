package com.onlinefoodordersystem.Food.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onlinefoodordersystem.Food.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
