package com.example.StudentSpringBootproject.Course;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class CourseController 
{
	private CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	@GetMapping("/courses")
	public String listCourses(Model model) {
		model.addAttribute("courses", courseService.getAllCourses());
		return "courses";
	}
	
	@GetMapping("/courses/new")
	public String createCourseForm(Model model) {
		
		// create student object to hold student form data
		Course course = new Course();
		model.addAttribute("students", course);
		return "create_course";
		
	}
	
	

}
