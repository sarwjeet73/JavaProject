package com.atish.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.atish.employee.model.EmployeeEntity;
import com.atish.employee.serviceImpl.EmployeeServiceImpl;

/**
 * This is a EmployeeController Class Which is use to Give the Reponse to the EntityClass
 * @author ATISH
 *
 */
@Controller
public class EmployeeController {
	
	/**
	 * Injecting the Service to Controller
	 */
	@Autowired
	private EmployeeServiceImpl empService;
	
	/**
	 * This method is used to perform SaveOperation
	 * @param employee
	 * @return String
	 */
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody EmployeeEntity employee){
		ResponseEntity<String> resp=null;
		try {
			Integer id=empService.saveEmployee(employee);
			resp=new ResponseEntity<String>("Employee"+id+"Created", HttpStatus.OK);
			
		}catch (Exception e) {
			resp=new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}//Method
	
	/**
	 * This Method is use to Perform GetOperation
	 * @return List of Employees
	 */
	@GetMapping("/fetchAllEmployee")
	public ResponseEntity<?> getAllEmployee(){
		List<EmployeeEntity> list=null;
		ResponseEntity<?> responseEntity=null;
		
		list=empService.getAllEmployees();
		//Checking the Condition
		if(list==null || list.isEmpty()) {
			String message="No Records Found";
			responseEntity=new ResponseEntity<String>(message	,HttpStatus.OK);
		}else {
			responseEntity=new ResponseEntity<List<EmployeeEntity>>(list,HttpStatus.OK);
		}
		return responseEntity;
	}
	/**
	 * This Method is Use to perform the Delete Operation
	 * @param id
	 * @return
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer id){
		ResponseEntity<String> responseEntity=null;
		
		boolean check=empService.isPresent(id);
		
		if(check) {
			empService.deleteEmployeeById(id);
			responseEntity=new ResponseEntity<String>("Deleted"+id+"SucessFully",HttpStatus.OK);
		}else {
			responseEntity=new ResponseEntity<String>(" "+id+"Not Exist",HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}
	/**
	 * This Method is use to perform the Update Operation
	 * @param employee
	 * @return
	 */
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody EmployeeEntity employee){
		ResponseEntity< String> responseEntity=null;
		
		boolean present=empService.isPresent(employee.getEmpId());
		
		if(present) {
			empService.updateEmployee(employee);
			responseEntity=new ResponseEntity<String>("Updated Successfully",HttpStatus.OK);
		}else {
			responseEntity=new ResponseEntity<String>("Record "+employee.getEmpId(),HttpStatus.BAD_REQUEST);
		}
		return responseEntity;		
	}
}//Class
