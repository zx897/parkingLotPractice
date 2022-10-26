package cn.thoughtworks.school.controllers;


import cn.thoughtworks.school.entities.dto.CustomerRequestDTO;
import cn.thoughtworks.school.entities.dto.EmployeRequestDTO;
import cn.thoughtworks.school.entities.dto.ParkingLotRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface ManagerController {

    @PostMapping("/parking-lot")
    void createParkingLot(ParkingLotRequestDto parkingLotRequestDto);

    @PostMapping("/employee")
    void createEmloyee(EmployeRequestDTO employeRequestDTO);

    @PostMapping("/customer")
    void createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO);

    @PostMapping("/parkingTicket/{employeeId}/{customerId}")
    void assignEmployee(Long employeeId, Long customerId);


}


