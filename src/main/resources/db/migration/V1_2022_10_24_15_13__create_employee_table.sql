CREATE TABLE Employee(
                         id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255),
                         managerId INT(11)
) engine=InnoDB DEFAULT CHARSET = utf8;