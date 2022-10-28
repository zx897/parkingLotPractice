package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Customer;
import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.entities.ParkingTicket;
import cn.thoughtworks.school.entities.Type;
import cn.thoughtworks.school.repository.CustomerRepository;
import cn.thoughtworks.school.repository.EmployeeRepository;
import cn.thoughtworks.school.repository.ParkingTicketRepository;
import cn.thoughtworks.school.services.ParkingTicketService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ParkingTicketServiceImpl implements ParkingTicketService {
    ParkingTicketRepository parkingTicketRepository;
    EmployeeRepository employeeRepository;
    CustomerRepository customerRepository;

    public ParkingTicketServiceImpl(ParkingTicketRepository parkingTicketRepository, EmployeeRepository employeeRepository, CustomerRepository customerRepository) {
        this.parkingTicketRepository = parkingTicketRepository;
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
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
}
