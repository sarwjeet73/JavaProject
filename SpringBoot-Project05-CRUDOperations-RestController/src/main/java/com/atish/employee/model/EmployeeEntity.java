package com.atish.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * This is a EmployeeEntity Class This Class Automatically Create a Table in the DataBase to perform db Operations
 * @author ATISH
 *
 */
@Entity
@Data
@Table(name = "EMPLOYEE_RESTCONTROLLER")
public class EmployeeEntity {
	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private Integer empId;
	@Column(name = "EMP_NAME")
	private String empName;
	@Column(name = "EMP_DEPT" )
	private String  empDept;
	@Column(name = "EMP_SALARY")
	private Double empSalary;
	@Column(name = "EMP_ADDRESS")
	private String empAddress;

}
