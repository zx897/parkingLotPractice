package cn.thoughtworks.school.services;

import cn.thoughtworks.school.entities.dto.ParkingLotRequestDto;

public interface ParkingLotService {
    void createParkingLot(ParkingLotRequestDto parkingLotRequestDto);
}
