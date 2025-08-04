package com.fitness.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness.user_service.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,String>{

	boolean existsByEmail(String email);

	User findByEmail(String email);

	Boolean existsByKeycloakId(String userId);

}
