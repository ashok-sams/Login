package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.services.UserService;



@Controller
public class UserController {
	
	 @Autowired
     private UserService  userService;
	 

	 @RequestMapping(value= {"/", "/login"},method=RequestMethod.GET)
	   public String index() 
	   {
	      return "login";
	   }
	 
	 @RequestMapping(value= {"UserRegtiser"},method=RequestMethod.POST)
	   public String Regiser(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("mobile") String mobile) 
	  {
		  User user=new User();
		  user.setName(name);
		  user.setEmail(email);
		  user.setPassword(password);
		  user.setMobile(mobile);
		  System.out.print(""+user.getName());
		  System.out.print(""+user.getEmail());
		  System.out.print(""+user.getPassword());
		  System.out.print(""+user.getMobile());
		  userService.save(user);
		  return "login";
		  
	    }
	 
	 @RequestMapping("/loginUser")
	   public String login(@RequestParam("email") String email,@RequestParam("password") String password) 
		  {
			  User user=new User();
			  user.setEmail(email);
			  user.setPassword(password);
			  System.out.print(""+user.getEmail());
			  System.out.print(""+user.getPassword());
			  List<User> s1= userService.login(user);
			  if((s1 != null) && !s1.isEmpty())
			  {
			  return "welcome";
			  }
			  else
				  
			  return "login";
			  
			  }
	 @RequestMapping("/logout")
     public String UserHome() {
          return "index";
        }
}
