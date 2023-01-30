package com.testp.book.model;  
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;

@Entity
@Table(name="customer")


public class Customer {
	//defines primary key
	@Id
	private int customerid;
	private String customer_name;
	private String customer_email;
	
	
	
	public Customer() {
	}
	public Customer(String customer_name, String customer_email) {
		this.customer_name = customer_name;
		this.customer_email = customer_email;
	}	
	public Customer(int customerid, String customer_name, String customer_email) {
		this.customerid = customerid;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
	}
	
	public int getCustomerId()
	{
		return customerid;
	}
	public void setCustomerId(int customerid)
	{
		this.customerid = customerid;
	}

	public String getCustomerName()  
	{
		return customer_name;  
	}  
	public void setCustomerName(String customer_name)   
	{
		this.customer_name = customer_name;  
	}  
	public String getCustomerEmail()  
	{
		return customer_email;  
	}  
	public void setCustomerEmail(String customer_email)   
	{
		this.customer_email = customer_email;  
	}  


}
