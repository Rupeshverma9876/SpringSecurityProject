package com.login.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.entity.User;
import com.login.repository.repository;
import com.login.service.Userservice;




@Controller
@Service
public class controller {
	@Autowired
	private Userservice userservice;
	@Autowired
	private repository userrepository;
	
	@GetMapping("/")
	public String base() {
		return "base";
	}
	@GetMapping("/user/index")
	public String index() {
		return "index";
	}
	@GetMapping("/user/about")
	public String about() {
		return "about";
	}
	@GetMapping("/user/profile")
	public String profile() {
		return "profile";
	}
	@GetMapping("/register")
	public String registeration() {
		return "register";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
        @PostMapping("/submit")	
		public String saveuser(@ModelAttribute User user) {
//        	System.out.println(user);
        User u = 	userservice.saveuser(user);
        	if(u!= null) {
        		System.out.println("success ho gaya");
        	}else {
        		
        		System.out.println("nahi hua save data");
        	}
        	return "redirect:/register";
		}
        
        @GetMapping("/user")
        public String showUsers(Model model) {
        	List<User> userList = userservice.getAllUsers();
           
            model.addAttribute("users", userList);  // sending data to HTML
            return "userpage"; // user-page.html
        }

}

