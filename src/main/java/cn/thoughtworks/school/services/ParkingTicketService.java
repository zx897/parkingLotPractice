package cn.thoughtworks.school.services;

public interface ParkingTicketService {
    void assignParkingTicket(Long employeeId, Long customerId);

    void finishParkingTicket(Long customerId);

    void createParkingTicket(Long customerId);
}
