package com.tns.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;

import com.tns.fooddeliverysystem.entities.Customer;

public class CustomerService {

    private List<Customer> customerList;

    public CustomerService() {
        customerList = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {

        if (customer != null) {
            customerList.add(customer);
        }
    }

    public Customer getCustomer(int userId) {

        for (Customer customer : customerList) {

            if (customer.getUserId() == userId) {
                return customer;
            }
        }

        return null;
    }

    public List<Customer> getCustomers() {
        return customerList;
    }
}