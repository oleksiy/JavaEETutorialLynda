package com.section4.springdata.repository;

import com.section4.springdata.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {
}
