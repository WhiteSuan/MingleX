package com.ksv.minglex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksv.minglex.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
	User findByUsernameAndPassword(String username, String password);
}
