package com.atish.employee.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atish.employee.model.EmployeeModel;

/**
 * This is a RestController Class
 * @author ATISH
 *
 */
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	/**
	 * This is a Normal GetMapping method
	 * @return String Message
	 */
	@GetMapping("/employeeA")
	public String empMsg() {
		return "Hello Employee";
	}
	
	/**
	 * This is a Normal GetMapping method
	 * @return Employee Object
	 */
	@GetMapping("/employeeB")
	public EmployeeModel showB() {
		return new EmployeeModel(22,"Atish Kumar",6.8);
	}

	/**
	 * This is a Normal GetMapping method
	 * @return List of Employee Object
	 */
	@GetMapping("/employeeC")
	public List<EmployeeModel> showC(){
		return Arrays.asList(new EmployeeModel(23, "Aishu", 20.0),
												new EmployeeModel(24, "Ashwini", 30.0),
												new EmployeeModel(25, "Atish", 46.0));
		
	}
	/**
	 * This is a GetMapping Method Of the Employee
	 * @return Map of Employee Objects
	 */
	@GetMapping("/employeeD")
	public Map<String, EmployeeModel> showD(){
		Map<String,EmployeeModel> empMap=new HashMap<String, EmployeeModel>();
		empMap.put("employee1", new EmployeeModel(26, "Kajal Agarwal", 50.6));
		empMap.put("employee2", new EmployeeModel(27, "Mahesh Babu", 40.0));
		empMap.put("employee3", new EmployeeModel(28, "Shiva", 48.0));
		return empMap;
	}
	@GetMapping("/employeeE")
	public ResponseEntity<String> showE(){
		ResponseEntity<String> responseEntity=new ResponseEntity<String>("Hello Atish Kumar",
																																				HttpStatus.OK);
		return responseEntity;
	}
}
