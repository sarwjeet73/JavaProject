package com.atish.employee.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * This is EmployeeModel Class which holds the Input values
 * @author ATISH
 *
 */
@Setter
@Getter
@ToString
@XmlRootElement
public class EmployeeModel {
	
	private Integer empId;
	private String empName;
	private Double empSalary;
	
	public EmployeeModel() {
		System.out.println("EmployeeModel.EmployeeModel()");
	}
	
	public EmployeeModel(Integer empId, String empName, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	
}
