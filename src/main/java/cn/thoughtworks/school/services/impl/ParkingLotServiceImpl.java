package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Employee;
import cn.thoughtworks.school.entities.ParkingLot;
import cn.thoughtworks.school.controllers.impl.dto.ParkingLotAssignDTO;
import cn.thoughtworks.school.controllers.impl.dto.ParkingLotCreateRequestDTO;
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
    public void createParkingLot(ParkingLotCreateRequestDTO parkingLotCreateRequestDto) {
        ParkingLot parkingLot = ParkingLot.builder()
                .name(parkingLotCreateRequestDto.getName())
                .build();
        parkingLotRepository.save(parkingLot);
    }


    @Override
    public void assignParkingLot(ParkingLotAssignDTO parkingLotAssignDTO) {
        Long parkingLotId = parkingLotAssignDTO.getParkingLotId();
        Long employeeId = parkingLotAssignDTO.getEmployeeId();
        // TODO: 2022/11/2   使用orElseThrow 全局排查，抛异常
        ParkingLot parkingLot = parkingLotRepository.findById(parkingLotId).orElseThrow(null);
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(null);
        // TODO: 2022/11/2 抛异常后删除 多余的判断
        if(parkingLot != null && employee != null && parkingLot.getEmployee() != null){
            parkingLot.setEmployee(employee);
            parkingLotRepository.save(parkingLot);
        }

    }
}
