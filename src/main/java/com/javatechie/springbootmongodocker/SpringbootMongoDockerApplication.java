package com.javatechie.springbootmongodocker;

import com.javatechie.springbootmongodocker.dao.BookRepository;
import com.javatechie.springbootmongodocker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class SpringbootMongoDockerApplication {

	@Autowired
	private BookRepository bookRepository;

	@PostMapping
	public Book addBook(@RequestBody Book book){
		return bookRepository.save(book);
	}

	@GetMapping
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoDockerApplication.class, args);
	}

}
