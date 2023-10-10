package com.manhattan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manhattan.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	

}
