package cn.thoughtworks.school.services;

import cn.thoughtworks.school.entities.dto.CustomerRequestDTO;

public interface CustomerService {
    void createCustomer(CustomerRequestDTO customerRequestDTO);
}
