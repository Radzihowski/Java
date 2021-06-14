package service;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Optional;

public class CustomerService {
    Collection<Customer> customers = new ArrayList<>();

    private static CustomerService customerService;

    // private constructor to facilitate the Singleton Pattern
    private CustomerService() {
    }

    //static reference for CustomerService class
    public static CustomerService getInstance() {
        if (null == customerService) {
            customerService = new CustomerService();
        }
        return customerService;
    }

    //method to add Customers
    public void addCustomer(String email, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, email);
        customers.add(customer);
    }

    //method to retrieve customers from Customer Collection
    public Customer getCustomer(String customerEmail) {
        for (Customer customer : customers ) {
            if ( customerEmail.equals(customer.getEmail())) {
                return customer;
            }
        }
        return null;
    }

    public Collection<Customer> getAllCustomers() {
        return customers;
    }

}
