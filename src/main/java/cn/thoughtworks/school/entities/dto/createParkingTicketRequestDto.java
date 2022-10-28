package cn.thoughtworks.school.entities.dto;

import cn.thoughtworks.school.entities.Customer;
import cn.thoughtworks.school.entities.Employee;

public class createParkingTicketRequestDto {
    private Long id;
    private Customer customer;
    private Employee employee;
    private enum type {
        NOTRECEIPTS, RECEIPT, PARKED;
    }}
