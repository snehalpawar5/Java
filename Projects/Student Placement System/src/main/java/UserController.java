package com.Project.PlacementManagementSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController 
{
    @Autowired
    private UserService service;

	
    @RequestMapping("/user")
	public String user(Model model)
	{
		User user = new User();
		model.addAttribute("user",user);
		
		return "user";
	}
	
}