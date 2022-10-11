package com.example.StudentSpringBootproject.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class StudentController 
{
	
	
	
	private StudentService studentService;
	public StudentController(StudentService studentService)
	{
		super();
		this.studentService= studentService;
		
	}

	@GetMapping("/students")
	public String listStudents(Model model)
	{
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("students", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{registrationid}")
	public String editStudentForm(@PathVariable Long registrationid, Model model) {
		model.addAttribute("student", studentService.getStudentById(registrationid));
		return "edit_student";
	}
	
	
	@PostMapping("/students/{registrationid}")
	public String updateStudent(@PathVariable Long registrationid,
			@ModelAttribute("student") Student student,
			Model model) {
		Student existingStudent = studentService.getStudentById(registrationid);
		existingStudent.setRegistrationid(registrationid);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setCourseid(student.getCourseid());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setDob(student.getDob());
		existingStudent.setMobilenumber(student.getMobilenumber());
		existingStudent.setEmailid(student.getEmailid());
		existingStudent.setCourseapplied(student.getCourseapplied());
		existingStudent.setLastcoursestudied(student.getLastcoursestudied());
		existingStudent.setDateofpass(student.getDateofpass());
		existingStudent.setAveragemarks(student.getAveragemarks());
		existingStudent.setStatus(student.getStatus());
		
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";	
	}
		@GetMapping("/students/{registrationid}")
		public String deleteStudent(@PathVariable Long registrationid) {
			studentService.deleteStudentById(registrationid);
			return "redirect:/students";
		}
}
