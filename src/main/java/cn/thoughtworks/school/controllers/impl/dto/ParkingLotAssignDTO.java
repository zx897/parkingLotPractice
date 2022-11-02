package cn.thoughtworks.school.controllers.impl.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingLotAssignDTO {
    // TODO: 2022/11/2  变量全部 private  全局排查
    Long parkingLotId;
    Long employeeId;
}
