package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.MyConfig;

public class DeleteEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(4);;
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService employeeService= (EmployeeService) applicationContext.getBean("employeeService");
		Employee employee2= employeeService.deleteEmployee(employee);
		if(employee2!=null) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("please check the data");
		}
		

	}

}
