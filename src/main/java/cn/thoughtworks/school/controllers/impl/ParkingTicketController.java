package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.controllers.impl.dto.ParkingTicketAssignDTO;
import cn.thoughtworks.school.services.ParkingTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/parkingTicket")
public class ParkingTicketController {
    private final ParkingTicketService parkingTicketService;


    //为顾客生成停车单
    @PostMapping
    public void createParkingTicket(@RequestBody Long customerId) {
        parkingTicketService.createParkingTicket(customerId);
    }

    //小弟抢单
    @PostMapping("/assignParkingTicket")
    public void assignParkingTicket(@RequestBody ParkingTicketAssignDTO parkingTicketAssignDTO) {
        parkingTicketService.assignParkingTicket(parkingTicketAssignDTO);
    }

    //顾客取车
    @PostMapping("/finishParkingTicket")
    public void finishParkingTicket( @RequestBody Long customerId) {
        parkingTicketService.finishParkingTicket(customerId);
    }

}

