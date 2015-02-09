package com.danpadgett.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.LabEntry;

@Repository
public interface LabEntryRepository extends MongoRepository<LabEntry, Long> {

}
