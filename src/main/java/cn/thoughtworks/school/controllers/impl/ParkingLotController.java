package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.entities.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.entities.dto.ParkingLotCreatRequestDTO;
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
    public void creatParkingLot(@RequestBody ParkingLotCreatRequestDTO parkingLotCreatRequestDto) {
        parkingLotService.createParkingLot(parkingLotCreatRequestDto);
    }

    //给停车场安排停车小弟
    @PostMapping("/assignParkingLot")
    public void assignParkingLot(@RequestBody ParkingLotAssignDTO parkingLotAssignDTO) {
        parkingLotService.assignParkingLot(parkingLotAssignDTO);
    }
}

