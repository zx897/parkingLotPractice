package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.services.ParkingTicketService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/parkingTicket")
public class ParkingTicketController {
    final ParkingTicketService parkingTicketService;

    public ParkingTicketController(ParkingTicketService parkingTicketService) {
        this.parkingTicketService = parkingTicketService;
    }

    @PostMapping("/creatParkingTicket/{employeeId}/{customerId}")

    public void creatParkingTicket(@PathVariable Long employeeId, @PathVariable Long customerId) {
        parkingTicketService.creatParkingTicket(employeeId, customerId);
    }

}

