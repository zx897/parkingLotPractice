package cn.thoughtworks.school.services;

import cn.thoughtworks.school.controllers.impl.dto.ParkingTicketAssignDTO;

public interface ParkingTicketService {
    void assignParkingTicket(ParkingTicketAssignDTO parkingTicketAssignDTO);

    void finishParkingTicket(Long customerId);

    void createParkingTicket(Long customerId);
}
