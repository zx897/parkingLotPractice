package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.controllers.impl.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.controllers.impl.dto.ParkingLotCreateRequestDTO;
import cn.thoughtworks.school.services.ParkingLotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: 2022/11/2 添加分页 （   根据停车场名称查询）
// TODO: 2022/11/2 根据 id 去查询停车场
@RestController
@RequestMapping(value = "/parkingLot")
@RequiredArgsConstructor
public class ParkingLotController {
    private final ParkingLotService parkingLotService;

    // TODO: 2022/11/2  添加manager 的信息，使用request header
    // TODO: 2022/11/2  排查全局restful 风格的URI是否符合

    @PostMapping("/createParkingLot")
    public void creatParkingLot(@RequestBody ParkingLotCreateRequestDTO parkingLotCreateRequestDto) {
        parkingLotService.createParkingLot(parkingLotCreateRequestDto);
    }

    /**
     *
     *
     *
     * 给停车场安排停车小弟
     *
     * @param parkingLotAssignDTO
     */
    @PostMapping("/assignParkingLot")
    public void assignParkingLot(@RequestBody ParkingLotAssignDTO parkingLotAssignDTO) {
        parkingLotService.assignParkingLot(parkingLotAssignDTO);
    }
}

