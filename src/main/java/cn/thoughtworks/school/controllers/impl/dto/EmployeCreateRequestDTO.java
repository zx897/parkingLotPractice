package cn.thoughtworks.school.controllers.impl.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeCreateRequestDTO {
    // TODO: 2022/11/2  全局判断 非空
    // TODO: 2022/11/2  全部排查命名少了 e
    // TODO: 2022/11/2  parkingLotCreateRequest  全局命名同一排查
    private String name;
}
