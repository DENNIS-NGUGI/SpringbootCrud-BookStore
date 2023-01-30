package com.testp.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.testp.book.model.Customer;
import com.testp.book.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
    CustomerService customerService;
    //retrieves all the customer detail from the database
    @GetMapping("/customer")
    private List<Customer>getAllCustomer()
    {
        return customerService.getAllCustomer(); 
    }
    //retrieves a specified customer
    @GetMapping("/customer/{customerid}")
    private Customer getAuthor(@PathVariable("customerid") int customerid)
    {
        return customerService.getCustomerById(customerid);
    }
    //deletes a specified customer
    @DeleteMapping("/customer/{customerid}")
    private void deleteCustomer(@PathVariable("customerid") int customerid)
    {
        customerService.delete(customerid);
    }
    //post customer in database
    @PostMapping("/customer")
    private int saveCustomer(@RequestBody Customer customer)
    {
        customerService.saveOrUpdate(customer);
        return customer.getCustomerId();

    }
    //updates book details
    @PutMapping("/customer")
    private Customer update(@RequestBody Customer customer)
    {
        customerService.saveOrUpdate(customer);
        return customer;
    }

}
