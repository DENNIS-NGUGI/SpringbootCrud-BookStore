package com.testp.book.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testp.book.model.Publisher;
import com.testp.book.repository.PublisherRepository;

@Service
public class PublisherService {
	@Autowired
	PublisherRepository publisherRepository;
	
	//getting all records
	public List<Publisher> getAllPublisher()
	{
		List<Publisher> publisher = new ArrayList<Publisher>();
		publisherRepository.findAll().forEach(publisher1 -> publisher.add(publisher1));
		return publisher;
		
	}
    //getting a specific record
    public Publisher getPublisherById(int id)
    {
        return publisherRepository.findById(id).get();
    }

    //saving a specific record
    public void saveOrUpdate(Publisher publisher)
    {
        publisherRepository.save(publisher);
    }

    //deleting a specific record
    public void delete(int id)
    {
        publisherRepository.deleteById(id);
    }

    //updating a record
    public void update(Publisher publisher, int publisherid)
    {
        publisherRepository.save(publisher);
    }

}



