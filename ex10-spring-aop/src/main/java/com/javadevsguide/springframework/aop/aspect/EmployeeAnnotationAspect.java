package com.javadevsguide.springframework.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	//When?		Where?
	@Before("@annotation(com.javadevsguide.springframework.aop.aspect.Loggable)")
	@After("@annotation(com.javadevsguide.springframework.aop.aspect.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}
