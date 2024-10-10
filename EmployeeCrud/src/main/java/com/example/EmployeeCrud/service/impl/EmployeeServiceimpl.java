package com.example.EmployeeCrud.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EmployeeCrud.entity.Employee;

import com.example.EmployeeCrud.repository.EmployeeRepository;
import com.example.EmployeeCrud.service.EmployeeService;


@Service
public class EmployeeServiceimpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public  void EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);	
	}

}