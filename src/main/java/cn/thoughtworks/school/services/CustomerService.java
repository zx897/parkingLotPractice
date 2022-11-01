package cn.thoughtworks.school.services;

import cn.thoughtworks.school.controllers.impl.dto.CustomerRequestCreatDTO;

public interface CustomerService {
    void createCustomer(CustomerRequestCreatDTO CustomerRequestCreatDTO);
}
