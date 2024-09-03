package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Umbrella;
import com.example.demo.model.User;


@Repository
public interface IUser extends CrudRepository<User, Integer> {
	
	@Query( value ="select * from user where username = :username and password= :password", nativeQuery = true)
	Iterable <User> getByUserNameAndPassword(@Param("username") String username, @Param("password") String password);
	
 
}
