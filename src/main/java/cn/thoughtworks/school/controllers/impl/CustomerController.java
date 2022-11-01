package cn.thoughtworks.school.controllers.impl;

import cn.thoughtworks.school.controllers.impl.dto.CustomerRequestCreatDTO;
import cn.thoughtworks.school.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/createCustomer")
    public void createCustomer(@RequestBody CustomerRequestCreatDTO customerRequestCreatDTO ) {
        customerService.createCustomer(customerRequestCreatDTO);
    }
}
