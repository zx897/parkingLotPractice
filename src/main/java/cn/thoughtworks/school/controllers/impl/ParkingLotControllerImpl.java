package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.services.ParkingLotService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/parkingTicket")
public class ParkingLotControllerImpl {
    final ParkingLotService parkingLotService;

    public ParkingLotControllerImpl() {
        parkingLotService = null;
    }



}


