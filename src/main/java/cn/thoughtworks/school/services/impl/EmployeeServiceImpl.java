package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.entities.dto.EmployeRequestDTO;
import cn.thoughtworks.school.repository.EmployeeRepository;
import cn.thoughtworks.school.services.EmployeeService;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void createEmployee(EmployeRequestDTO employeRequestDTO) {
        Employee employee = Employee.builder()
                .name(employeRequestDTO.getName())
                .build();
        employeeRepository.save(employee);
    }
}
