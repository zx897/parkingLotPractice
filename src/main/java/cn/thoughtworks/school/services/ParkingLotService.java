package cn.thoughtworks.school.services;

import cn.thoughtworks.school.controllers.impl.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.controllers.impl.dto.ParkingLotCreateRequestDTO;

public interface ParkingLotService {
    void createParkingLot(ParkingLotCreateRequestDTO parkingLotCreateRequestDto);

    void assignParkingLot(ParkingLotAssignDTO parkingLotAssignDTO);
}
