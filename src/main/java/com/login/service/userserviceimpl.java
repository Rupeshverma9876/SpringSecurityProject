package com.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.entity.User;
import com.login.repository.repository;

@Service
public class userserviceimpl implements Userservice{
	@Autowired
	private repository repo;
	@Autowired
	private BCryptPasswordEncoder bcryptpasswordencoder;

	@Override
	public User saveuser(User user) {
		// TODO Auto-generated method stub
		String p = bcryptpasswordencoder.encode(user.getPassword());
		user.setPassword(p);
		user.setRole("role-user");
		User hello  = repo.save(user);
		return hello;
	}
	@Autowired
    private repository repository;
	
	public List<User> getAllUsers() {
        return repository.findAll();
    }

	

}
