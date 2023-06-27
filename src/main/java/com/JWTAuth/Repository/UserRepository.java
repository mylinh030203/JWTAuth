package com.JWTAuth.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JWTAuth.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);
}
