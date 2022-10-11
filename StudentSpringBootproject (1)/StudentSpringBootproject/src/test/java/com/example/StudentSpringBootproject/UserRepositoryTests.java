package com.example.StudentSpringBootproject;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

//import com.example.StudentSpringBootproject.Course.Course;
//import com.example.StudentSpringBootproject.Course.CourseRepository;
import com.example.StudentSpringBootproject.entity.Registration;
import com.example.StudentSpringBootproject.entity.RegistrationRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests 
{
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private RegistrationRepository repo1;
	
//	@Autowired
//	private CourseRepository repo2;
//	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreatUser()
	{
		User user = new User();
		user.setRoleid(102);
		user.setUsername("Ashutosh");
		user.setFirstname("ashutosh");
		user.setLastname("kulkarni");
		user.setMobileno("9853200704");
		user.setEmailid("ashu@gmail.com");
		user.setPassword("ashu@123");
		user.setStatus("student");
		
		User savedUser = repo.save(user);
		User existUser = entityManager.find(User.class, savedUser.getUserid());
		assertThat(existUser.getEmailid()).isEqualTo(user.getEmailid());
		
		
	}
//	@Test
//	public void testFindUserByEmail()
//	{
//		String emailid = "swag11@java.net";
//		
//		User user = repo.findByEmail(emailid);
//		
//		assertThat(user).isNotNull();
//	}
//	{
//		
//	}
	
	@Test
	public void testCreatRegister()
	{
		Registration registration = new Registration();
		
		registration.setFirstname("swagatika");
		registration.setCourseid(1);
		registration.setLastname("prusty");
		registration.setDob("12-march-2001");
		registration.setMobilenumber("9853200703");
		registration.setEmailid("swag@gmail.com");
		registration.setCourseapplied("B.tech") ;
		registration.setLastcoursestudied("12TH");
		registration.setDateofpass("12-Aug-2018");
		registration.setAveragemarks(78);
		registration.setStatus("student");
		
		Registration savedRegistration = repo1.save(registration);
		Registration existRegistration = entityManager.find(Registration.class, savedRegistration.getRegistrationid());
		assertThat(existRegistration.getEmailid()).isEqualTo(registration.getEmailid());
		
		
	}
	
//	@Test
//	public void testCrestCourse()
//	{
//		Course course = new Course();
//		
//		course.setCoursename("B.tech.");
//		course.setDuration("4 years");
//		course.setCoursefee("2,20,000 /year");
//		
//		Course savedCourse = repo2.save(course);
//		Course existCourse = entityManager.find(Course.class, savedCourse.getCourseid());
//		
//	}

}
