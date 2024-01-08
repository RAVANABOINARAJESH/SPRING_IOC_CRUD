package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.MyConfig;

public class UpdateEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(2);
		employee.setName("vijay");
		employee.setPhone(996337856l);
		employee.setSal(29000.0);
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService employeeService= (EmployeeService) applicationContext.getBean("employeeService");
		Employee employee2= employeeService.updatedEmployee(employee);
		if(employee2!=null) {
			System.out.println("data updated");
		}
		else {
			System.out.println("please check the data");
		}

	}

}
