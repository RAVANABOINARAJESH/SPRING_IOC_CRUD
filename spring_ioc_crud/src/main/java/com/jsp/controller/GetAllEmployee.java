package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.MyConfig;

public class GetAllEmployee {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService employeeService= (EmployeeService) applicationContext.getBean("employeeService");
		List<Employee> list= employeeService.getAll();
		for (Employee employee : list) {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getPhone());
			System.out.println(employee.getSal());
			System.out.println("***************");
		}

	}

}
