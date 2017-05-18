package com.faisal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.faisal.model.UserDetails;
import com.faisal.model.UserLogin;
import com.faisal.service.UserDetailsService;

@Controller
public class UserController {

	@Autowired
	UserDetailsService userDetailsService;
	
	
	@RequestMapping(value="updateUser",method=RequestMethod.POST)
	public String updateUser(@ModelAttribute UserDetails userDetails,Map<String,Object> map){
		
		userDetailsService.updateUser(userDetails);
		map.put("userLogin", new UserLogin());
		return "login";
	}
	
	
	
}
