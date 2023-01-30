package com.testp.book.model;  
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;

@Entity
@Table

public class Publisher {
	@Id
	private int publisher_id;
	private String publisher_name;
	private String location;
	
	
	
	public Publisher() {

	}
	public Publisher( String publisher_name, String location) {
		this.publisher_name = publisher_name;
		this.location = location;
	}
	public Publisher(int publisher_id, String publisher_name, String location) {
		super();
		this.publisher_id = publisher_id;
		this.publisher_name = publisher_name;
		this.location = location;
	}
	
	
	public int getPublisherId()
	{
		return publisher_id;
	}
	public void setPublisherId(int publisher_id)
	{
		this.publisher_id = publisher_id;
		
	}
	public int getPublisher_Id()
	{
		return publisher_id;
	}
	public void setPublisher_Id(int publisher_id)
	{
		this.publisher_id = publisher_id;
		
	}

	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getPublisher_name()
	{
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name)
	{
		this.publisher_name = publisher_name;
	}
}
