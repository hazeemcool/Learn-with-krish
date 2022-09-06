package com.krishantha.training.salesmanager.repository;
import java.util.ArrayList;
import java.util.List;

import com.krishantha.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Override
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees  =new ArrayList<>();
		
		Employee employee2=new Employee();
		employee2.setEmployeeName("Hazeem");
		employee2.setEmployeeLocation("Colombo");
		
		employees.add(employee2);
		
		return employees;
		
		
		
	}

}
