package com.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.Audit;

@Repository
public interface AuditRepository extends CrudRepository<Audit,Long>{

}
