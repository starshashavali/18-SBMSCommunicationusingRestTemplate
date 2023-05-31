package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Department1;

public interface DepartmentRepository extends JpaRepository<Department1, Integer> {

	

}
