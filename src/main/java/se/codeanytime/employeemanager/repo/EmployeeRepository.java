package se.codeanytime.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.codeanytime.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
