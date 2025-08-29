<<<<<<< HEAD
=======
<<<<<<< HEAD
package com.gow.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gow.demo.entites.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	List<User> getUserByName(String name);

	
 
	
}  


 
=======
>>>>>>> my-feature-branch
package com.gow.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gow.demo.entites.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	List<User> getUserByName(String name);

	
 
	
}  


 
<<<<<<< HEAD
=======
>>>>>>> af4bfed9 (added all the files)
>>>>>>> my-feature-branch
 