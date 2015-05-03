package com.danpadgett.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.danpadgett.model.TutorialEntry;

public interface RoleRepository extends MongoRepository<TutorialEntry, Long> {

}
