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

    @PostMapping("/createParking-lot")
    public void createParkingLot(@RequestBody ParkingLotRequestDto parkingLotRequestDto) {
        managerService.createParkingLot(parkingLotRequestDto);
    }



    @PostMapping("/createCustomer")

    public void createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        managerService.createCustomer(customerRequestDTO);
    }

    @PostMapping("/creatParkingTicket/{employeeId}/{customerId}")

    public void creatParkingTicket(@PathVariable Long employeeId, @PathVariable Long customerId) {
        managerService.creatParkingTicket(employeeId, customerId);
    }

}
