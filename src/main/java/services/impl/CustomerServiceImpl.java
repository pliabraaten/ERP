package services.impl;

import models.Customer;
import repository.CustomerRepository;
import services.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();
    }
}
