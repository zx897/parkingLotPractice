package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.controllers.impl.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.controllers.impl.dto.ParkingLotCreatRequestDTO;
import cn.thoughtworks.school.services.ParkingLotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/parkingLot")
@RequiredArgsConstructor
public class ParkingLotController {
    private final ParkingLotService parkingLotService;

    @PostMapping("/createParkingLot")
    public void creatParkingLot(@RequestBody ParkingLotCreatRequestDTO parkingLotCreatRequestDto) {
        parkingLotService.createParkingLot(parkingLotCreatRequestDto);
    }

    //给停车场安排停车小弟
    @PostMapping("/assignParkingLot")
    public void assignParkingLot(@RequestBody ParkingLotAssignDTO parkingLotAssignDTO) {
        parkingLotService.assignParkingLot(parkingLotAssignDTO);
    }
}

