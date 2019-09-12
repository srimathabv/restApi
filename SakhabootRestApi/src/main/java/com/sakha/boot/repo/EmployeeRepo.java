package com.sakha.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakha.boot.model.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
