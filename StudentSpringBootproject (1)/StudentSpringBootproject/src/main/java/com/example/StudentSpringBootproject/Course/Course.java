package com.example.StudentSpringBootproject.Course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long courseid;
	
	@Column(name = "coursename")
	String coursename;
	
	@Column(name = "duration")
	String duration;
	
	@Column(name = "coursefee")
	String coursefee;

	
	
	public Course(String coursename, String duration, String coursefee) 
	{
		super();
		this.coursename = coursename;
		this.duration = duration;
		this.coursefee = coursefee;
	}


		// TODO Auto-generated constructor stub
	

	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Long getCourseid()
	{
		return courseid;
	}

	public void setCourseid(Long courseid) 
	{
		this.courseid = courseid;
	}

	public String getCoursename() 
	{
		return coursename;
	}

	public void setCoursename(String coursename) 
	{
		this.coursename = coursename;
	}

	public String getDuration() 
	{
		return duration;
	}

	public void setDuration(String duration)
	{
		this.duration = duration;
	}

	public String getCoursefee()
	{
		return coursefee;
	}

	public void setCoursefee(String coursefee)
	{
		this.coursefee = coursefee;
	}

	
}
