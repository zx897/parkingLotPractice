package cn.thoughtworks.school.repository;

import cn.thoughtworks.school.entities.ParkingTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParkingTicketRepository extends JpaRepository<ParkingTicket,Long> {
}
