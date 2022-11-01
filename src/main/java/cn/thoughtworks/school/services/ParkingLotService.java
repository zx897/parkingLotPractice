package cn.thoughtworks.school.services;

import cn.thoughtworks.school.entities.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.entities.dto.ParkingLotCreatRequestDTO;

public interface ParkingLotService {
    void createParkingLot(ParkingLotCreatRequestDTO parkingLotCreatRequestDto);

    void assignParkingLot(ParkingLotAssignDTO parkingLotAssignDTO);
}
