package com.login.service;

import java.util.List;

import com.login.entity.User;

public interface Userservice {

	public User saveuser(User user);

	public List<User> getAllUsers();
}
