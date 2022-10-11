package com.example.StudentSpringBootproject.controller;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.StudentSpringBootproject.User;
import com.example.StudentSpringBootproject.UserRepository;

import com.example.StudentSpringBootproject.entity.Admin;

import com.example.StudentSpringBootproject.entity.Registration;
import com.example.StudentSpringBootproject.entity.RegistrationRepository;

@Controller
public class AppController
{
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private RegistrationRepository repo1;
	
	@GetMapping("")
	public String viewHomePage()
	{
		return "index";
	}
	
	@GetMapping("/aboutus")
	public String showaboutus() {
	   
	     
	    return "aboutus";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
	    model.addAttribute("user", new User());
	     
	    return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
//	   BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//	    String encodedPassword = encoder.encode(user.getPassword());
//	   user.setPassword(encodedPassword);
//	     
	   //userRepo.save(user);
		repo.save(user);
	     
	    return "register_success";
	}

	@GetMapping("/list_users")
	public String viewUserList(Model model)
	{
		List<User> listUsers = repo.findAll();
		model.addAttribute("listUsers", listUsers);
		return "users";
		
	}

	 @GetMapping("/admin")
	 public String showLogin() {
	  return "adminlogin";
	 }
	@PostMapping("/admin")
	 public String login(@ModelAttribute(name="loginForm") Admin admin, Model m) {
	  String uname = admin.getUsername();
	  String pass = admin.getPassword();
	  if(uname.equals("Admin") && pass.equals("Admin@123")) {
	   m.addAttribute("uname", uname);
	   m.addAttribute("pass", pass);
	   return "welcomadmin";
	  }
	  m.addAttribute("error", "Incorrect Username & Password");
	  return "adminlogin";
	  
	 }
	
	@GetMapping("/studentregister")
	public String showStudentRegister(Model model) {
	    model.addAttribute("registration", new Registration());
	     
	    return "studentregister";
	}
	
	

	@PostMapping("/process1_register")
	public String processRegister1(Registration registration) {
//	   BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//	    String encodedPassword = encoder.encode(user.getPassword());
//	   user.setPassword(encodedPassword);
//	     
	   //userRepo.save(user);
		repo1.save(registration);
	     
	    return "studentsucessfull";
	}
	
}