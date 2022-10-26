package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.*;
import cn.thoughtworks.school.entities.dto.CustomerRequestDTO;
import cn.thoughtworks.school.entities.dto.EmployeRequestDTO;
import cn.thoughtworks.school.entities.dto.ParkingLotRequestDto;
import cn.thoughtworks.school.repository.CustomerRepository;
import cn.thoughtworks.school.repository.EmployeeRepository;
import cn.thoughtworks.school.repository.ParkingLotRepository;
import cn.thoughtworks.school.repository.ParkingTicketRepository;
import cn.thoughtworks.school.services.ManagerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService {

    ParkingLotRepository parkingLotRepository;
    ParkingTicketRepository parkingTicketRepository;
    EmployeeRepository employeeRepository;
    CustomerRepository customerRepository;

    public ManagerServiceImpl(EmployeeRepository employeeRepository, CustomerRepository customerRepository) {
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
    }

    public ManagerServiceImpl(ParkingLotRepository parkingLotRepository, ParkingTicketRepository parkingTicketRepository, EmployeeRepository employeeRepository, CustomerRepository customerRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingTicketRepository = parkingTicketRepository;
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void createParkingLot(ParkingLotRequestDto parkingLotRequestDto) {
        ParkingLot parkingLot = ParkingLot.builder()
                .name(parkingLotRequestDto.getName())
                .build();
        parkingLotRepository.save(parkingLot);
    }

    @Override
    public void createEmployee(EmployeRequestDTO employeRequestDTO) {
        Employee employee = Employee.builder()
                .name(employeRequestDTO.getName())
                .build();
        employeeRepository.save(employee);
    }

    @Override
    public void creatParkingTicket(Long employeeId, Long customerId) {
        Optional<Employee> employeeById = employeeRepository.findById(employeeId);
        Optional<Customer> customerById = customerRepository.findById(customerId);
        ParkingTicket parkingTicket = ParkingTicket.builder()
                .type(Type.RECEIPT)
                .customer(customerById.orElse(null))
                .employee(employeeById.orElse(null))
                .build();
        parkingTicketRepository.save(parkingTicket);

    }

    @Override
    public void createCustomer(CustomerRequestDTO customerRequestDTO) {
        Customer customer = Customer.builder()
                .name(customerRequestDTO.getName())
                .carLicense(customerRequestDTO.getCarLicense())
                .build();
        customerRepository.save(customer);

    }
}
