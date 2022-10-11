package com.example.StudentSpringBootproject.Student;

import java.util.List;



public interface StudentService 
{
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long registrationid);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long registrationid);

}
