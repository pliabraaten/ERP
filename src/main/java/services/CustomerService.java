package services;

import models.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomer(Long id);

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);
}
