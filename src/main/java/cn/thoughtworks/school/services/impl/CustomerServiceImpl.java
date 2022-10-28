package cn.thoughtworks.school.services.impl;

import cn.thoughtworks.school.entities.Customer;
import cn.thoughtworks.school.entities.dto.createCustomerRequestDTO;
import cn.thoughtworks.school.repository.CustomerRepository;
import cn.thoughtworks.school.services.CustomerService;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(createCustomerRequestDTO createCustomerRequestDTO) {
        Customer customer = Customer.builder()
                .name(createCustomerRequestDTO.getName())
                .carLicense(createCustomerRequestDTO.getCarLicense())
                .build();
        customerRepository.save(customer);

    }
}
