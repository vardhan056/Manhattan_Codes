package com.manhattan;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manhattan.entity.Employee;
import com.manhattan.repo.EmployeeRepo;

@SpringBootTest
public class ApplicationTests {
	@Autowired
	EmployeeRepo repo;
	
	@Test
	public void Testsave() {
		Employee e = new Employee();
		e.setEdi(1001);
		e.setName("sam");
		e.setSal(45000.0);
		
		Employee emp=repo.save(e);
		
		assertNotNull(emp);
		assertThat(emp.getEdi()).isNotEqualTo(null);
	}
	@Test
	public void TestfindAll() {
		Employee e = new Employee();
		e.setEdi(1001);
		e.setName("sam");
		e.setSal(45000.0);
		
		repo.save(e);
		Employee e1 = new Employee();
		e1.setEdi(1002);
		e1.setName("Ram");
		e1.setSal(40000.0);
		
		repo.save(e1);
		List<Employee> emp=repo.findAll();
		assertNotNull(emp);
		assertThat(emp).isNotNull();
		assertEquals(2,emp.size());
	}
}
