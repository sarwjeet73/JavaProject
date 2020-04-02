package com.atish.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atish.employee.model.EmployeeEntity;

/**
 * This is a EmployeeRepository Interface which contains PreDefined Methods to perform db operations on the DB
 * @author ATISH
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
