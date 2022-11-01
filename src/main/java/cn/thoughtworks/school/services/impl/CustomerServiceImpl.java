package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Customer;
import cn.thoughtworks.school.entities.dto.CustomerRequestCreatDTO;
import cn.thoughtworks.school.repository.CustomerRepository;
import cn.thoughtworks.school.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void createCustomer(CustomerRequestCreatDTO CustomerRequestCreatDTO) {
        Customer customer = Customer.builder()
                .name(CustomerRequestCreatDTO.getName())
                .carLicense(CustomerRequestCreatDTO.getCarLicense())
                .build();
        customerRepository.save(customer);

    }
}
