package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.entities.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.entities.dto.createParkingLotRequestDTO;
import cn.thoughtworks.school.services.ParkingLotService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/parkingLot")
public class ParkingLotController {
    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @PostMapping("/createParking-lot")
    public void creatParkingLot(@RequestBody createParkingLotRequestDTO createParkingLotRequestDto) {
        parkingLotService.createParkingLot(createParkingLotRequestDto);
    }

    //给停车场安排停车小弟
    @PostMapping("/assignParkingLot/{parkingLotId}/{employeeId}")
    public void assignParkingLot(@RequestBody ParkingLotAssignDTO parkingLotAssignDTO) {
        parkingLotService.assignParkingLot(parkingLotAssignDTO);
    }
}

