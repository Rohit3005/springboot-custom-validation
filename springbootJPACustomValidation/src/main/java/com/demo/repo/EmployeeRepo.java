package com.demo.repo;

import com.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    //custom method

    public List<Employee> findByEmpFirstName(String empFirstName);

    public Employee findByEmpContactNumber(String empContactNumber);

    public Employee findByEmpEmailId(String empEmailId);

    public List<Employee> findByEmpEmailIdAndEmpPassword(String empEmailId, String empPassword);

    public List<Employee> findByEmpFirstNameAndEmpLastName(String empFirstName, String empLastName);
}
