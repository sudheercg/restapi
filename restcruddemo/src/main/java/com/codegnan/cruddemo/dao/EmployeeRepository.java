package com.codegnan.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codegnan.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code !

}
