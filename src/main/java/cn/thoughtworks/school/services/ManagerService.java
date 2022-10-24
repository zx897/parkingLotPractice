package cn.thoughtworks.school.services;

import cn.thoughtworks.school.entities.dto.CustomerRequestDTO;
import cn.thoughtworks.school.entities.dto.EmployeRequestDTO;
import cn.thoughtworks.school.entities.dto.ParkingLotRequestDto;



public interface ManagerService {
    void createParkingLot( ParkingLotRequestDto parkingLotRequestDto);

    void createEmployee(EmployeRequestDTO employeRequestDTO);

    void creatParkingTicket(Long employeeId, Long customerId);

    void createCustomer(CustomerRequestDTO customerRequestDTO);
}
