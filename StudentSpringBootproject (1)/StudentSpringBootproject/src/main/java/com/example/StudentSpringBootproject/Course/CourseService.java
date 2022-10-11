package com.example.StudentSpringBootproject.Course;

import java.util.List;



public interface CourseService {

	List<Course> getAllCourses();
	
	Course saveCourse(Course course);
	
	

}
