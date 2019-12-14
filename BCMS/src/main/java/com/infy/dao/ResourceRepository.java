package com.infy.dao;

import com.infy.entity.Resources;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends CrudRepository<Resources,Long> {

}
