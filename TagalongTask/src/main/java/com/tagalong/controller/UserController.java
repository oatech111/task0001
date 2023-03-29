package com.tagalong.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tagalong.entity.User;

@RestController
public class UserController {
	@GetMapping("/getData/{email}/{password}")
	public Map<String,String> getData(@PathVariable("email")String email,
			@PathVariable("password") String password){
		
		try{
			
			Map<String,String> emailpass=new HashMap<>();
			
			return emailpass;	
		}catch (Exception e) {
			e.getMessage();
		}
		return new HashMap<String, String>();
	
	}
	@PostMapping("/postData")
	public Map<String,String> createData(@RequestBody User user){
try{
			
			Map<String,String> emailpass=new HashMap<>();
			
			return emailpass;	
		}catch (Exception e) {
			e.getMessage();
		}
		
		return new HashMap<String, String>();
	}
	
	

}
