package com.javatechie.springbootmongodocker.dao;

import com.javatechie.springbootmongodocker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
