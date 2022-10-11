package com.example.StudentSpringBootproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long registrationid;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "courseid")
	private int courseid;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "dob")
	private String dob;//date
	
	@Column(name = "mobilenumber")
	private String mobilenumber;
	
	@Column(name = "emailid")
	private String emailid;
	
	@Column(name = "courseapplied")
	private String courseapplied;
	
	@Column(name = "lastcoursestudied")
	private String lastcoursestudied;
	
	@Column(name = "dateofpass")
	private String dateofpass;//date
	
	@Column(name = "averagemarks")
	private int averagemarks;
	
	@Column(name = "status")
	private String status;

	public Long getRegistrationid() 
	{
		return registrationid;
	}

	public void setRegistrationid(Long registrationid) 
	{
		this.registrationid = registrationid;
	}

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}

	public int getCourseid() 
	{
		return courseid;
	}

	public void setCourseid(int courseid)
	{
		this.courseid = courseid;
	}

	public String getLastname() 
	{
		return lastname;
	}

	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}

	public String getDob()
	{
		return dob;
	}

	public void setDob(String dob) 
	{
		this.dob = dob;
	}


	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	

	public String getEmailid() 
	{
		return emailid;
	}

	
	public void setEmailid(String emailid) 
	{
		this.emailid = emailid;
	}

	public String getCourseapplied() 
	{
		return courseapplied;
	}

	public void setCourseapplied(String courseapplied) 
	{
		this.courseapplied = courseapplied;
	}

	public String getLastcoursestudied()
	{
		return lastcoursestudied;
	}

	public void setLastcoursestudied(String lastcoursestudied)
	{
		this.lastcoursestudied = lastcoursestudied;
	}

	public String getDateofpass() 
	{
		return dateofpass;
	}

	public void setDateofpass(String dateofpass)
	{
		this.dateofpass = dateofpass;
	}

	public int getAveragemarks() 
	{
		return averagemarks;
	}

	public void setAveragemarks(int averagemarks) 
	{
		this.averagemarks = averagemarks;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	
}
