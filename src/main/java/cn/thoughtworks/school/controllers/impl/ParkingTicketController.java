package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.services.ParkingTicketService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/parkingTicket")
public class ParkingTicketController {
    final ParkingTicketService parkingTicketService;

    public ParkingTicketController(ParkingTicketService parkingTicketService) {
        this.parkingTicketService = parkingTicketService;
    }


    @PostMapping("/assignParkingTicket/{employeeId}/{customerId}")

    public void creatParkingTicket(@PathVariable Long employeeId, @PathVariable Long customerId) {
        parkingTicketService.creatParkingTicket(employeeId, customerId);
    }

    //顾客取车
    @PostMapping("/finishParkingTicket/{customerId}")
    public void finishParkingTicket( @PathVariable Long customerId) {
        parkingTicketService.finishParkingTicket(customerId);
    }

}

