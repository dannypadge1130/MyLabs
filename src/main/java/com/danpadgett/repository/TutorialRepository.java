package com.danpadgett.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.Tutorial;

@Repository
public interface TutorialRepository extends MongoRepository<Tutorial, Long>{

}
