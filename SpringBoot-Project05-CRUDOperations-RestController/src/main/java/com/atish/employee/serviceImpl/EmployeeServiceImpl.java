package com.atish.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atish.employee.model.EmployeeEntity;
import com.atish.employee.repository.EmployeeRepository;

/**
 * This is EmployeeService Class Which is Implemented from the EmployeeService
 * interface
 * 
 * @author ATISH
 *
 */
@Service
public class EmployeeServiceImpl implements com.atish.employee.service.EmployeeService {

	/**
	 * Injecting the EmployeeRepository to the Service Layer
	 */
	@Autowired
	private EmployeeRepository empRepo;

	/**
	 * This Methos is Use to perform Save Operation
	 */
	@Override
	public Integer saveEmployee(EmployeeEntity emp) {
		return empRepo.save(emp).getEmpId();
	}

	/**
	 * This Method is use to Fetch the All Employees From the DB
	 */
	@Transactional(readOnly = true)
	public List<EmployeeEntity> getAllEmployees() {
		return empRepo.findAll();
	}

	/**
	 * This Method is use to Perform Delete Operation
	 */
	@Override
	@Transactional
	public boolean deleteEmployeeById(Integer id) {
		empRepo.deleteById(id);
		return false;
	}

	@Transactional(readOnly = true)
	public boolean isPresent(Integer id) {
		return empRepo.existsById(id);
	}
	/**
	 * This Method is use to Perform Update Operation
	 */
	@Transactional
	@Override
	public void updateEmployee(EmployeeEntity emp) {
		empRepo.save(emp);

	}

}
