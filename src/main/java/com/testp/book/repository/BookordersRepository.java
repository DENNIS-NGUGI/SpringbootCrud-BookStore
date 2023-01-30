package com.testp.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.testp.book.model.Bookorders;

public interface BookordersRepository extends JpaRepository<Bookorders, Integer>{


}
