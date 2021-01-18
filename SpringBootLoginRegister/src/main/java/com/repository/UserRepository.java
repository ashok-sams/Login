package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	 @Query(("SELECT user FROM User user where user.email=:email and user.password=:password"))
		List<User> findAll(@Param("email") String email, @Param("password") String password);
}
