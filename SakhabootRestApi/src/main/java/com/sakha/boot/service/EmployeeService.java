package com.sakha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.boot.model.Employee;
import com.sakha.boot.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;


	public Employee save(Employee emp)
	{
		return repo.save(emp);
	}
	
	
	public Employee getEmployee(int empId)
	{
		return repo.getOne(empId);
		
	}
	
	public List<Employee> getAllemployees()
	{
		return repo.findAll();
	}
	
	public void deleteEmployee(int empId)
	{
		   repo.deleteById(empId);
	}
	
	 public Employee updateEmployee(Employee emp) {
	        return repo.save(emp);
	    }
	
	 
	 public boolean delete(int empId)
	 {
		 Employee emp = repo.getOne(empId);
		 repo.delete(emp);
		 return true;
		 
	 }
	 
	 public boolean update(Employee emp) throws Exception
	 {
		 Employee empup = repo.getOne(emp.getId());
		 repo.save(empup);
		 return true;
	 }
}
	
