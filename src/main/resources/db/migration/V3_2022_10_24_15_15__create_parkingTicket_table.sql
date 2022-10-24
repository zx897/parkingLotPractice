CREATE TABLE ParkingTicket(
                        id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        customerId VARCHAR(255),
                        employeeId INT(11),
                        type VARCHAR(255)
) engine=InnoDB DEFAULT CHARSET = gbk;