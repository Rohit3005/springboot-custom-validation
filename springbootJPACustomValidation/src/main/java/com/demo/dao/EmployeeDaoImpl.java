package com.demo.dao;

import com.demo.model.Employee;
import com.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee signUp(Employee employee) {
        return employeeRepoImpl.save(employee);

    }

    public boolean signIn(String empEmailId, String empPassword) {
        boolean flag = false;

        if (employeeRepoImpl.findByEmpEmailIdAndEmpPassword(empEmailId, empPassword).size() >= 1) {
            flag = true;
        }
        return flag;
    }

    public Optional<Employee> getDataById(int empId) {
        return employeeRepoImpl.findById(empId);
    }

    public List<Employee> getAllData() {
        return employeeRepoImpl.findAll();
    }

    public Employee getDataByContactNumber(String empContactNumber) {
        return employeeRepoImpl.findByEmpContactNumber(empContactNumber);
    }

    public List<Employee> getDataByName(String empFirstName) {
        return employeeRepoImpl.findByEmpFirstName(empFirstName);
    }

    public Employee getDataByEmailId(String empEmailId) {
        return employeeRepoImpl.findByEmpEmailId(empEmailId);
    }

    public Employee updateData(Employee employee) {
        return employeeRepoImpl.save(employee);
    }

    public void deleteDataById(int empId) {
        employeeRepoImpl.deleteById(empId);
    }

    public void deleteAllData() {
        employeeRepoImpl.deleteAll();
    }
}
