package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.entities.dto.createEmployeRequestDTO;
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
    public void createEmployee(createEmployeRequestDTO createEmployeRequestDTO) {
        Employee employee = Employee.builder()
                .name(createEmployeRequestDTO.getName())
                .build();
        employeeRepository.save(employee);
    }
}
