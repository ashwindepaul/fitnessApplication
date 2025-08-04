package com.fitness.activity_service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fitness.activity_service.model.Activity;

@Repository
public interface ActivityRepository extends MongoRepository<Activity,String>{

	List<Activity> findByUserId(String userId);

}
