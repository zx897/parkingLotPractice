package cn.thoughtworks.school.services;

import cn.thoughtworks.school.entities.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.entities.dto.createParkingLotRequestDTO;

public interface ParkingLotService {
    void createParkingLot(createParkingLotRequestDTO createParkingLotRequestDto);

    void assignParkingLot(ParkingLotAssignDTO parkingLotAssignDTO);
}
