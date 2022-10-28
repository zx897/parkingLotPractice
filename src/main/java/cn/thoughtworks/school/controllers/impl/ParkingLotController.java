package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.entities.dto.createParkingLotRequestDto;
import cn.thoughtworks.school.services.ParkingLotService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/parkingLot")
public class ParkingLotController {
    final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @PostMapping("/createParking-lot")
    public void creatParkingLot(@RequestBody createParkingLotRequestDto createParkingLotRequestDto) {
        parkingLotService.createParkingLot(createParkingLotRequestDto);
    }

}

