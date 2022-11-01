package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.entities.dto.EmployeCreateRequestDTO;
import cn.thoughtworks.school.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/createEmloyee")
    public void createEmloyee(@RequestBody EmployeCreateRequestDTO EmployeCreateRequestDTO) {
        employeeService.createEmployee(EmployeCreateRequestDTO);
    }
}
