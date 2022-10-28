package cn.thoughtworks.school.services;

import cn.thoughtworks.school.entities.dto.EmployeRequestDTO;

public interface EmployeeService {
    void createEmployee(EmployeRequestDTO employeRequestDTO);
}
