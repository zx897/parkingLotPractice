package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.entities.ParkingLot;
import cn.thoughtworks.school.entities.dto.createParkingLotRequestDto;
import cn.thoughtworks.school.repository.EmployeeRepository;
import cn.thoughtworks.school.repository.ParkingLotRepository;
import cn.thoughtworks.school.services.ParkingLotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ParkingLotServiceImpl implements ParkingLotService {

    private final ParkingLotRepository parkingLotRepository;
    private final EmployeeRepository employeeRepository;


    @Override
    public void createParkingLot(createParkingLotRequestDto createParkingLotRequestDto) {
        ParkingLot parkingLot = ParkingLot.builder()
                .name(createParkingLotRequestDto.getName())
                .build();
        parkingLotRepository.save(parkingLot);
    }

    @Override
    public void assignParkingLot(Long parkingLotId, Long employeeId) {
        ParkingLot parkingLot = parkingLotRepository.findById(parkingLotId).orElseThrow(null);
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(null);
        if(parkingLot != null && employee != null){
            parkingLot.setEmployee(employee);
            parkingLotRepository.save(parkingLot);
        }
    }
}
