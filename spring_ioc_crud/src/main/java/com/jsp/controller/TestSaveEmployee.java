package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.MyConfig;

public class TestSaveEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(5);
		employee.setName("ammulu");
		employee.setPhone(56498272l);
		employee.setSal(164391.0);
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService employeeService= (EmployeeService) applicationContext.getBean("employeeService");
		Employee employee2= employeeService.saveEmployee(employee);
		if(employee2!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("please check the data");
		}

	}

}
