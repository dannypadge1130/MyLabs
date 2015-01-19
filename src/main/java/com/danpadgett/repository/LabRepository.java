package com.danpadgett.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.Lab;

@Repository
public interface LabRepository extends MongoRepository<Lab, Long> {

}
