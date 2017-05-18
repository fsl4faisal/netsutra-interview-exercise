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
import com.faisal.service.UserLoginService;

@Controller
public class LoginController {

	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@ModelAttribute("hobbies")
	public List<String> getHobbies(){
		List<String> hobbies=new ArrayList<String>();
		hobbies.add("singing");
		hobbies.add("dancing");
		hobbies.add("watching movies");
		return hobbies;
		
	}
	
	@ModelAttribute("interests")
	public List<String> getInterests(){
		List<String> interests=new ArrayList<String>();
		interests.add("coding");
		interests.add("bootraping");
		interests.add("playing chess");
		return interests;
	}
	
	@RequestMapping("/")
	public String  loginPage(Map<String,Object> map){
		map.put("userLogin", new UserLogin());
		return "login";
	}
	
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public String authenticateUser(@ModelAttribute UserLogin userLogin,Map<String,Object> map){
		int id=userLoginService.checkLogin(userLogin);
		if(id!=0){
			UserDetails userDetails=userLoginService.getUserDetails(id);
			if(userDetails!=null){
				System.out.println("userDetails was not null");
				map.put("userDetails",userDetails);
				return "edit";
			}
			else{
				System.out.println("userDetails was null");
				userDetails=new UserDetails();
				userDetails.setId(id);
				userDetailsService.saveUser(userDetails);
				map.put("userDetails",userDetails);
			}
				
			return "edit";
		}else{
			map.put("userLogin", new UserLogin());
			return "login";
		}
		
	}
}
