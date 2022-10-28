package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.ParkingLot;
import cn.thoughtworks.school.entities.dto.createParkingLotRequestDto;
import cn.thoughtworks.school.repository.ParkingLotRepository;
import cn.thoughtworks.school.services.ParkingLotService;
import org.springframework.stereotype.Service;


@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    ParkingLotRepository parkingLotRepository;

    public ParkingLotServiceImpl(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public void createParkingLot(createParkingLotRequestDto createParkingLotRequestDto) {
        ParkingLot parkingLot = ParkingLot.builder()
                .name(createParkingLotRequestDto.getName())
                .build();
        parkingLotRepository.save(parkingLot);
    }
}
