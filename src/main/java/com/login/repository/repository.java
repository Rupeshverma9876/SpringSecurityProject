package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.entity.User;



public interface repository extends JpaRepository<User, Integer > {

	public User  findByEmail(String email);

	
	
}
