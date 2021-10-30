package com.asutech.dao.repository;

import com.asutech.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DepartmentRepository extends MongoRepository<Department, String> {

	Optional<Department> findById(String l);
}
