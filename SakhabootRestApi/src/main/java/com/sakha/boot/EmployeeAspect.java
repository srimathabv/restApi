package com.sakha.boot;

import org.aspectj.lang.annotation.After;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



	
@Component
@Aspect
public class EmployeeAspect {

	
	@Pointcut("within(com.sakha.boot.service.EmployeeService)")
	public void op()
	{
		
	}
	
	@Before("op()")
	public void showDeleteLog()
	{
		System.out.println("transaction started....");
	}
	
    @AfterReturning("op()")
	public void showDeleteLogger()
	{
		System.out.println("transaction successfull...");
	}


    @AfterThrowing("op()")
	public void afterFailure()
	{
		System.out.println("transaction failed.");
	}
}



