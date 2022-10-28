package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.entities.dto.CustomerRequestDTO;
import cn.thoughtworks.school.entities.dto.EmployeRequestDTO;
import cn.thoughtworks.school.entities.dto.ParkingLotRequestDto;
import cn.thoughtworks.school.services.ManagerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/manager")
public class MangerController {
    final ManagerService managerService;

    public MangerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @PostMapping("/parking-lot")
    public void createParkingLot(@RequestBody ParkingLotRequestDto parkingLotRequestDto) {
        managerService.createParkingLot(parkingLotRequestDto);
    }

    @PostMapping("/employee")

    public void createEmloyee(@RequestBody EmployeRequestDTO employeRequestDTO) {
        managerService.createEmployee(employeRequestDTO);
    }

    @PostMapping("/customer")

    public void createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        managerService.createCustomer(customerRequestDTO);
    }

    @PostMapping("/parkingTicket/{employeeId}/{customerId}")

    public void assignEmployee(@PathVariable Long employeeId, @PathVariable Long customerId) {
        managerService.creatParkingTicket(employeeId, customerId);
    }


}
