package io.swagger.api.employee;

import io.swagger.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(emp -> employees.add(emp));
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findOne(id);
    }

    public void saveOrUpdate(Employee Employee) {
        employeeRepository.save(Employee);
    }

    public void delete(int id) {
        employeeRepository.delete(id);
    }
}