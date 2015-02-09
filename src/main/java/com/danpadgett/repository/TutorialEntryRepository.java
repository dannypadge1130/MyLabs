package com.danpadgett.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.TutorialEntry;

@Repository
public interface TutorialEntryRepository extends MongoRepository<TutorialEntry, Long>{

}
