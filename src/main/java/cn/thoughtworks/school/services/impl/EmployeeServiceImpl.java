package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.controllers.impl.dto.EmployeCreateRequestDTO;
import cn.thoughtworks.school.repository.EmployeeRepository;
import cn.thoughtworks.school.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(EmployeCreateRequestDTO EmployeCreateRequestDTO) {
        Employee employee = Employee.builder()
                .name(EmployeCreateRequestDTO.getName())
                .build();
        employeeRepository.save(employee);

    }
}
