package com.example.demo.mysql_conn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mysql_conn.user_info.UserInfo;

public interface UserRepo extends JpaRepository<UserInfo, Integer>
{


}
