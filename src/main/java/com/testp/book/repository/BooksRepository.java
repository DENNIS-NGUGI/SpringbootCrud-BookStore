package com.testp.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.testp.book.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>{


}
