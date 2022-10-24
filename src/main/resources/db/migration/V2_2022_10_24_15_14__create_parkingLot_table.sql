CREATE TABLE ParkingLot(
                        id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        parkingLotName VARCHAR(255),
                        employeeId INT(11),
                        managerId INT(11)
) engine=InnoDB DEFAULT CHARSET = gbk;