package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Customer;
import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.entities.ParkingTicket;
import cn.thoughtworks.school.entities.Type;
import cn.thoughtworks.school.repository.CustomerRepository;
import cn.thoughtworks.school.repository.EmployeeRepository;
import cn.thoughtworks.school.repository.ParkingTicketRepository;
import cn.thoughtworks.school.services.ParkingTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ParkingTicketServiceImpl implements ParkingTicketService {
    private final ParkingTicketRepository parkingTicketRepository;
    private final EmployeeRepository employeeRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void createParkingTicket(Long customerId) {
        Optional<Customer> customerById = customerRepository.findById(customerId);
        ParkingTicket parkingTicket = ParkingTicket.builder()
                .type(Type.UNSIGNED)
                .customer(customerById.orElse(null))
                .build();
        parkingTicketRepository.save(parkingTicket);
    }

    @Override
    public void assignParkingTicket(Long employeeId, Long customerId) {
        Optional<Employee> employeeById = employeeRepository.findById(employeeId);
        Optional<ParkingTicket> parkingTicketById = parkingTicketRepository.findById(customerId);
        if (parkingTicketById.isPresent() && employeeById.isPresent()) {
            ParkingTicket parkingTicket = parkingTicketById.get();
            parkingTicket.setType(Type.PARKED );
            parkingTicket.setEmployee(employeeById.get());
            parkingTicketRepository.save(parkingTicket);
        }

    }

    @Override
    public void finishParkingTicket(Long customerId) {
        Optional<ParkingTicket> parkingTicketById = parkingTicketRepository.findById(customerId);
        if (parkingTicketById.isPresent()) {
            ParkingTicket parkingTicket = parkingTicketById.get();
            parkingTicket.setType(Type.FINISHED );        }
    }


}
