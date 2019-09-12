package com.sakha.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sakha.boot.model.Employee;
import com.sakha.boot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	   
	    @Autowired
		EmployeeService service;
		/*
		@PostMapping("/add")
		public String addEmployee(@ModelAttribute Employee emp,Model m )
		{
			Employee semp = service.save(emp);
			m.addAttribute("emp",semp);
			return "view";
		
		}
		
		@GetMapping("/employees")
		public String getallEmployees(Model m)
		
		{
			List<Employee> empList = service.getAllemployees();
			m.addAttribute("empList", empList);
			return "viewall";
		}

		@GetMapping("/employ")
		public String getEmployee(@RequestParam("id") int empId, Model m)
		{
			Employee emp =service.getEmployee(empId);
			m.addAttribute("emp", emp);
			return "viewemp";
		}
		@GetMapping("/delete")
		public String deleteEmployee(@RequestParam("id") int empId, Model m)
		{
		   	
			service.deleteEmployee(empId);
			return "view";
		}
		  @PostMapping("/update")
		    public String updateEmployee(@ModelAttribute Employee emp, Model m) {
		     //   System.out.println(this.getClass().getSimpleName() + " - Update employee details by id is invoked.");
		 
		        Employee upemp =  service.getEmployee(emp.getId());
		       
		 
		         IMPORTANT - To prevent the overriding of the existing value of the variables in the database, 
		         * if that variable is not coming in the @RequestBody annotation object. (emp.getName() != null )
		            upemp.setName(emp.getName());
		        if(emp.getDob() != null )
		            upemp.setDob(emp.getDob());
		        if(emp.getSalary() != 0)
		            upemp.setSalary(emp.getSalary());
		 
		        // Required for the "where" clause in the sql query template.
		        upemp.setId(emp.getId());

				Employee pemp = service.save(upemp);
				m.addAttribute("pemp",pemp);
				return "view";
		      //  return service.updateEmployee(upemp);
		    }*/
	     
	    @GetMapping("/employee")
	    public List<Employee> getAllEmployees() throws Exception
	    {
	    	return service.getAllemployees();
	    }
	    @GetMapping("/employee/{empId}")
	    public Employee getemployee(@PathVariable("empId") int empId) throws Exception
	    {
	    	return service.getEmployee(empId);
	    }
	    
	    @PostMapping("/employee")
	    public Employee saveEmployee(@RequestBody Employee emp) throws Exception
	    {
	    	return service.save(emp);
	    }
	    
	    @DeleteMapping("/employee/{empId}")
	    public boolean delete(@PathVariable("empId") int empId) throws Exception

        {
	    	return service.delete(empId);
	    	 
        }
	    @PutMapping("/employee")
	    public boolean updateEmployee(@RequestBody Employee emp) throws Exception
	    {
	    	
	    	return service.update(emp);
	    	
	    }
	    	
	    	
}	    	
	    	
	    	
	    	
	    	
	    	
	    
	    
	    


		