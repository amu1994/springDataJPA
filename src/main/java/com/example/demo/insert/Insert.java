package com.example.demo.insert;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repo.DepartRepo;
import com.example.demo.repo.Employeerepo;
@Component
public class Insert implements CommandLineRunner {
	@Autowired
	DepartRepo departRepo;
	@Autowired
	Employeerepo emprepo;
	

	
	public void run(String... args) throws Exception {
		Employee emp = new Employee(11,"Amit","Noida");
		Employee emp1 = new Employee(12,"deepak","phase 3");
		Employee emp2 = new Employee(13,"manish","Nepal");
		Employee emp3 = new Employee(14,"ashish","bihar");
		emprepo.save(emp);
		emprepo.save(emp1);
		emprepo.save(emp2);
		emprepo.save(emp3);
		
		
		Department dept = new Department(101, "sql", "mumbai", Arrays.asList(emp1,emp2));
		Department dept1 = new Department(102, "developer", "noida", Arrays.asList(emp,emp3));
		departRepo.save(dept);
		departRepo.save(dept1);
		

	}

}
