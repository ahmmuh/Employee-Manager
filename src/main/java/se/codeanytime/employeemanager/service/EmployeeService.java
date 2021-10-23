package se.codeanytime.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.codeanytime.employeemanager.model.Employee;
import se.codeanytime.employeemanager.repo.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
       return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getEmployee(Long id){
        return employeeRepository.getEmployeeById(id);
    }

    public Employee updateEmployee(Employee employee){
       return employeeRepository.save(employee);
    }

   public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
 }

}
