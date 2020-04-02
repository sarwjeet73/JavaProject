package com.atish.employee.service;

import java.util.List;

import com.atish.employee.model.EmployeeEntity;

/**
 * This is a EmployeeService Interface it contains abstract methos to perform the Business Operation on DB
 * @author ATISH
 *
 */
public interface EmployeeService {
	
	public Integer saveEmployee(EmployeeEntity emp);//Save
	public List<EmployeeEntity> getAllEmployees();//Fetch All Employees
	public boolean deleteEmployeeById(Integer id);//Delete Employee By Id
	public boolean isPresent(Integer id);
	public void updateEmployee(EmployeeEntity emp);
}
