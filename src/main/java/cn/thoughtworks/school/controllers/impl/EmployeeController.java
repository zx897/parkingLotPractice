package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.controllers.impl.dto.EmployeCreateRequestDTO;
import cn.thoughtworks.school.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/createEmloyee")
    public void createEmloyee(@RequestBody EmployeCreateRequestDTO employeCreateRequestDTO) {
        employeeService.createEmployee(employeCreateRequestDTO);
    }
}
