package com.example.demo.mysql_conn.order_repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.mysql_conn.order_details.Orderitems;

public interface OrderRepo extends JpaRepository<Orderitems, Integer> {


}
