package cn.thoughtworks.school.controllers;


import cn.thoughtworks.school.entities.dto.CustomerRequestDTO;
import cn.thoughtworks.school.entities.dto.EmployeRequestDTO;
import cn.thoughtworks.school.entities.dto.ParkingLotRequestDto;


public interface ManagerController {

    void createParkingLot( ParkingLotRequestDto parkingLotRequestDto);
    void createEmloyee(EmployeRequestDTO employeRequestDTO);

    void createCustomer(CustomerRequestDTO customerRequestDTO);
    void assignEmloyee(Long employeeId, Long customerId);


}


