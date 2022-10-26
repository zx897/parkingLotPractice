package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Customer;
import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.entities.Manager;
import cn.thoughtworks.school.entities.ParkingTicket;
import cn.thoughtworks.school.repository.CustomerRepository;
import cn.thoughtworks.school.repository.EmployeeRepository;
import cn.thoughtworks.school.repository.ParkingTicketRepository;
import org.mockito.Mockito;

import java.util.Optional;

import static org.mockito.Mockito.when;

class ManagerServiceImplTest {

    @org.junit.jupiter.api.Test
    void createParkingLot() {

    }

    @org.junit.jupiter.api.Test
    void createEmployee() {
    }

    @org.junit.jupiter.api.Test
    void creatParkingTicket() {
    }
//测试方法名反应 测试对象
    @org.junit.jupiter.api.Test
    void createCustomer() {
        //Given
        final Long employeeId = 1L;
        final Long customerId = 2L;
        final EmployeeRepository employeeRepository = Mockito.mock(EmployeeRepository.class);
        final CustomerRepository customerRepository = Mockito.mock(CustomerRepository.class);
        final ParkingTicketRepository parkingTicketRepository = Mockito.mock(ParkingTicketRepository.class);
        when(employeeRepository.findById(employeeId)).thenReturn(Optional.ofNullable(buildEmployee()));
        when(customerRepository.findById(customerId)).thenReturn(Optional.ofNullable(buildCustomer()));
        when(parkingTicketRepository.save(Mockito.any(ParkingTicket.class))).thenReturn(Optional.ofNullable(buildParkingTicket));


        final ManagerServiceImpl managerService = new ManagerServiceImpl(employeeRepository, customerRepository);
        managerService.creatParkingTicket(employeeId, customerId);
        Mockito.verify(parkingTicketRepository).save()

    }

    private Customer buildCustomer() {
        return Customer.builder()
                .customerId(2L)
                .name("aa")
                .carLicense("shanx123")
                .build();
    }

    private Employee buildEmployee() {
        return Employee.builder()
                .id(1L)
                .name("bb")
                .manageId(Manager.builder().managerId(1L).name("aa").build())
                .build();
    }
}