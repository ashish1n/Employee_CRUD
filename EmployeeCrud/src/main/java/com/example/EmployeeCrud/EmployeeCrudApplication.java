package com.example.EmployeeCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.EmployeeCrud.entity.Employee;
import com.example.EmployeeCrud.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void run(String... args) throws Exception {
		
		
		 Employee employee1 = new Employee("Ramesh", "10-11-1984", "ramesh@gmail.com", "2000", "24", "Active");
		 employeeRepository.save(employee1);
		 
		 Employee employee2 = new Employee("Sanjay", "05-04-1956", "sanjay@gmail.com", "50000", "43", "Active");
		 employeeRepository.save(employee2);
		 
		 Employee employee3 = new Employee("tony", "18-10-1939", "tony@gmail.com", "12000", "33", "Inactive");
		employeeRepository.save(employee3);
		 
	}

}
