package cn.thoughtworks.school.services;

import cn.thoughtworks.school.controllers.impl.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.controllers.impl.dto.ParkingLotCreatRequestDTO;

public interface ParkingLotService {
    void createParkingLot(ParkingLotCreatRequestDTO parkingLotCreatRequestDto);

    void assignParkingLot(ParkingLotAssignDTO parkingLotAssignDTO);
}
