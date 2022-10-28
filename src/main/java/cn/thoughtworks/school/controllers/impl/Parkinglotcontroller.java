package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.entities.dto.ParkingLotRequestDto;
import cn.thoughtworks.school.services.ParkingLotService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/parkingLot")
public class ParkingLotcontroller {

    final ParkingLotService parkingLotService;

    public ParkingLotcontroller(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @PostMapping("/createParking-lot")
    public void createParkingLot(@RequestBody ParkingLotRequestDto parkingLotRequestDto) {
        parkingLotService.createParkingLot(parkingLotRequestDto);
    }


}
