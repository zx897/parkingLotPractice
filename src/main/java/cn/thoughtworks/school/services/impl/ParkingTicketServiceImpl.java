package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Customer;
import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.entities.ParkingTicket;
import cn.thoughtworks.school.entities.Type;
import cn.thoughtworks.school.controllers.impl.dto.ParkingTicketAssignDTO;
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
        // TODO: 2022/11/2  判断客户是否找到
        Optional<Customer> customerById = customerRepository.findById(customerId);
        ParkingTicket parkingTicket = ParkingTicket.builder()
                .type(Type.UNSIGNED)
                .customer(customerById.orElse(null))
                .build();
        parkingTicketRepository.save(parkingTicket);
    }

    @Override
    public void assignParkingTicket(ParkingTicketAssignDTO parkingTicketAssignDTO) {
        Long employeeId = parkingTicketAssignDTO.getEmployeeId();
        Long customerId = parkingTicketAssignDTO.getCustomerId();
        Optional<Employee> employeeById = employeeRepository.findById(employeeId);
        Optional<ParkingTicket> parkingTicketById = parkingTicketRepository.findById(customerId);
        // TODO: 2022/11/2 判断是否被分配 
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
        // TODO: 2022/11/2  添加状态判断
        if (parkingTicketById.isPresent()) {
            ParkingTicket parkingTicket = parkingTicketById.get();
            parkingTicket.setType(Type.FINISHED );        }
    }


}
