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
import com.testp.book.model.Publisher;
import com.testp.book.service.PublisherService;

@RestController
public class PublisherController {
	@Autowired
	PublisherService publisherService;
	
	//retrieves all records
	@GetMapping("/publisher")
	private List<Publisher> getAllPublisher()
	{
		return publisherService.getAllPublisher();
	}
	
	//retrieves a specific record
	@GetMapping("/publisher/{publisherid}")
	private Publisher getPublisher(@PathVariable("publisherid") int publisherid)
	{
		return publisherService.getPublisherById(publisherid);
		
	}
	
	//deletes a specific record
	@DeleteMapping("/publisher/{publisherid}")
	private void deletePublisher(@PathVariable("publisherid") int publisherid)
	{
		publisherService.delete(publisherid);
		
	}
	
	//posting a record
	@PostMapping("/publishers")
	private int savePublisher(@RequestBody Publisher publisher)
	{
		publisherService.saveOrUpdate(publisher);
		return publisher.getPublisherId();
	}
	
	//updates a record
	@PutMapping("/publisher")
	private Publisher update(@RequestBody Publisher publisher)
	{
		publisherService.saveOrUpdate(publisher);
		return publisher;
	}
	
	

}
