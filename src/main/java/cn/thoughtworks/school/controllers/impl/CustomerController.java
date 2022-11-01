package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.entities.dto.CustomerRequestCreatDTO;
import cn.thoughtworks.school.services.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/createCustomer")
    public void createCustomer(@RequestBody CustomerRequestCreatDTO CustomerRequestCreatDTO) {
        customerService.createCustomer(CustomerRequestCreatDTO);
    }
}
