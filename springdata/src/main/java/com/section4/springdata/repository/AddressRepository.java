package com.section4.springdata.repository;

import com.section4.springdata.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, Integer> {
}
