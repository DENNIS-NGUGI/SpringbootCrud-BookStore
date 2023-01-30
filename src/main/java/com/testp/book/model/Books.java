package com.testp.book.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name="book") 

public class Books {
 
//Defining book id as primary key  
@Id  
private int bookid;  
private String bookname; 
private int publisherid;
private int authorid;
private double price; 
private String booktype;





public Books() {
}
public Books(String bookname, int publisherid, int authorid, double price, String booktype) {
	this.bookname = bookname;
	this.publisherid = publisherid;
	this.authorid = authorid;
	this.price = price;
	this.booktype = booktype;
}
public Books(int bookid, String bookname, int publisherid, int authorid, double price, String booktype) {
	this.bookid = bookid;
	this.bookname = bookname;
	this.publisherid = publisherid;
	this.authorid = authorid;
	this.price = price;
	this.booktype = booktype;
}

public int getBookid()   
{
	return bookid;  
}

public void setBookid(int bookid)   
{
	this.bookid = bookid;  
}  
public String getBookname()  
{
	return bookname;  
}  
public void setBookname(String bookname)   
{
	this.bookname = bookname;  
}  
public int getAuthor()   
{
	return authorid;  
}  
public void setAuthor(int authorid)   
{
	this.authorid = authorid;  
} 
public int getPublisherI()   
{
	return authorid;  
}  
public void setPublisherId(int publisherid)   
{
	this.publisherid = publisherid;  
} 
public double getPrice()   
{
	return price;  
}  
public void setPrice(double price)   
{
	this.price = price;  
}
public String getbooktype()   
{
	return booktype;  
}  
public void setbooktype(String booktype)   
{
	this.booktype = booktype;  
}

} 
