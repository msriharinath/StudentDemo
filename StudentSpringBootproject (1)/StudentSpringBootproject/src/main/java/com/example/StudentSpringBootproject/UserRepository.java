package com.example.StudentSpringBootproject;

import org.springframework.data.jpa.repository.JpaRepository;



//import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long> {
//{
//	@Query("SELECT u FROM User u WHERE u.emailid = ?1")
//	User findByEmail(String emailid);

	

}
