package com.example.StudentSpringBootproject.Course;

import java.util.List;

import org.springframework.stereotype.Service;





@Service
public class CourseServiceImpl implements CourseService
{

	private CourseRepository courseRepository;
	
	
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}



	@Override
	public List<Course> getAllCourses() {
	
		return courseRepository.findAll();
	}



	@Override
	public Course saveCourse(Course course) {
		
		return courseRepository.save(course);
	}

	

}

