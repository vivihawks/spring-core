package com.javadevsguide.springframework.aop.service;

import com.javadevsguide.springframework.aop.model.Employee;

public class EmployeeService {

	private Employee employee;
	
	public Employee getEmployee(){

		/*
		 * 
		 * ***Start Transaction***
		 * 
		 * Complex Operation 1 ....
		 * Complex Operation 2 ....
		 * Complex Operation 3 ....
		 * 
		 * ...
		 * Call service A
		 * ...
		 * ..
		 * Update service B
		 * ....
		 * Cal Dao X.
		 * ..
		 * 
		 * Complex Operation 100...
		 * 
		 * *** Commit Transaction ***
		 * 
		 * catch (any exception)
		 * 		*** Rollback Transaction ***
		 * 
		 */
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
}



/**
 * 
 * Pre AOP Service 
 * ~~~~~~~~~~~~~~~
 * Employee Service
 * 		addEmployee
 * 			Start Transacction
 * 				Validate employee object
 * 				persist employee objecdt
 * 			Commit Transaction
 * 			Catch Error
 * 				Rollback Transaction
 * 
 * 
 * Post AOP Service
 * -----------------
 * Target
 * ~~~~~~
 * Employee Service
 * 		addEmployee
 * 				Validate employee object
 * 				persist employee object
 * 
 * 
 * Transaction Aspect
 * ~~~~~~~~~~~~~~~~~~ 
 * 		Before Advice
 * 			start transaction
 * 		After Returning
 * 			commit transaction
 *		After Throwing
 *			rollback transaction 
 *
 * 
 * 
 * Weaving Process = Target + Aspect = Proxy
 * ----------------------------------------
 * Proxy
 * ~~~~~
 * Employee Service Proxy extends Employee Service
 * 		addEmployee
 * 			Start Transacction
 * 				Validate employee object
 * 				persist employee objecdt
 * 			Commit Transaction
 * 			Catch Error
 * 				Rollback Transaction
 * 
 * 
 * 
 */
