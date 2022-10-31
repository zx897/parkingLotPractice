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


    //为顾客生成停车单
    @PostMapping("/assignParkingTicket/{customerId}")
    public void createParkingTicket(@PathVariable Long customerId) {
        parkingTicketService.createParkingTicket(customerId);
    }

    //小弟抢单
    @PostMapping("/assignParkingTicket/{employeeId}/{customerId}")

    public void assignParkingTicket(@PathVariable Long employeeId, @PathVariable Long customerId) {
        parkingTicketService.assignParkingTicket(employeeId, customerId);
    }

    //顾客取车
    @PostMapping("/finishParkingTicket/{customerId}")
    public void finishParkingTicket( @PathVariable Long customerId) {
        parkingTicketService.finishParkingTicket(customerId);
    }

}

