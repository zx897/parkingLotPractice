package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.services.ParkingTicketService;
import com.sun.tools.javac.comp.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/parkingTicket")
public class ParkingTicketController {
    private final ParkingTicketService parkingTicketService;

    public ParkingTicketController(ParkingTicketService parkingTicketService) {
        this.parkingTicketService = parkingTicketService;
    }


    //为顾客生成停车单
    @PostMapping
    public void createParkingTicket(@RequestBody Long customerId) {
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

