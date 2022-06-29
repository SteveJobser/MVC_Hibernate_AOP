package com.tregulov.spring.mvc.aspect;

import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
@Order(1)
public class MyLoggingAspect {
  
  @Before("execution(public List<Employee> getAllEmployees())")
	static void loggingGetAllEmployee(args) {
	    System.out.println("Логируем данные в БД");
	}
}
