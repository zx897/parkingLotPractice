package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.controllers.ManagerController;
import cn.thoughtworks.school.entities.dto.CustomerRequestDTO;
import cn.thoughtworks.school.entities.dto.EmployeRequestDTO;
import cn.thoughtworks.school.entities.dto.ParkingLotRequestDto;
import cn.thoughtworks.school.services.ManagerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/manager")
public class MangerControllerImpl implements ManagerController {
    final ManagerService managerService;

    public MangerControllerImpl(ManagerService managerService) {
        this.managerService = managerService;
    }

    @Override
    public void createParkingLot(@RequestBody ParkingLotRequestDto parkingLotRequestDto) {
        managerService.createParkingLot(parkingLotRequestDto);
    }

    @Override
    public void createEmloyee(@RequestBody EmployeRequestDTO employeRequestDTO) {
        managerService.createEmployee(employeRequestDTO);
    }

    @Override
    public void createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        managerService.createCustomer(customerRequestDTO);
    }

    @Override
    public void assignEmployee(@PathVariable Long employeeId, @PathVariable Long customerId) {
        managerService.creatParkingTicket(employeeId, customerId);
    }


}
