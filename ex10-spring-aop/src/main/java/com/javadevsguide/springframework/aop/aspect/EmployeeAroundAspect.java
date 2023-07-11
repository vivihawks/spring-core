package com.javadevsguide.springframework.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAroundAspect {

	@Around("execution(* com.javadevsguide.springframework.aop.model.Employee.*())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Before invoking getName() method");
		Object value = null;
		try {
			//Before Steps
			//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
			//if(the sun rises in the west)
			value = proceedingJoinPoint.proceed();

			//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			//After success steps
		} catch (Throwable e) {
			//After error steps
			e.printStackTrace();
		}
		System.out.println("After invoking getName() method. Return value="+value);
		//After completion steps
		return value;
	}
}
