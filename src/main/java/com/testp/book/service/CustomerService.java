package com.testp.book.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testp.book.model.Customer;
import com.testp.book.repository.CustomerRepository;
import java.util.ArrayList;
import java.util.List;


//defining business logic
@Service

public class CustomerService {

	@Autowired
    CustomerRepository customerRepository;

    //getting all Customers records
    public List<Customer> getAllCustomer()
    {
        List<Customer> customer = new ArrayList<Customer>();
        customerRepository.findAll().forEach(customer1 -> customer.add(customer1));
        return customer;
    }

    //getting a specific record
    public Customer getCustomerById(int id)
    {
        return customerRepository.findById(id).get();
    }

    //saving a specific record
    public void saveOrUpdate(Customer customer)
    {
        customerRepository.save(customer);
    }

    //deleting a specific record
    public void delete(int id)
    {
        customerRepository.deleteById(id);
    }

    //updating a record
    public void update(Customer customer, int customerid)
    {
        customerRepository.save(customer);
    }

}
