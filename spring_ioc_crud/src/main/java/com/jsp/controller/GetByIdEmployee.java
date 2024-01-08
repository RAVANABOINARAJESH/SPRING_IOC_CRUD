package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.MyConfig;

public class GetByIdEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(3);
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService employeeService= (EmployeeService) applicationContext.getBean("employeeService");
		List<Employee> employee2= employeeService.getById(employee);
		if(employee2!=null) {
		for (Employee employee3 : employee2) {
			System.out.println(employee3.getId());
			System.out.println(employee3.getName());
			System.out.println(employee3.getSal());
			System.out.println(employee3.getPhone());
		}
		}
		else {
			System.out.println("please enter correct value");
		}

	}

}
