package com.jamescummins.booksearch.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jamescummins.booksearch.domain.entity.AuthorTableEntity;
import com.jamescummins.booksearch.domain.entity.BookTableEntity;
import com.jamescummins.booksearch.domain.entity.PublisherTableEntity;
import com.jamescummins.booksearch.repository.BookTableRepository;

@RestController
@RequestMapping(value = { "/books" })
public class BookController {

	@Autowired
	private BookTableRepository bookTableRepository;
	
	@GetMapping(path = {"","/"})
	public List<BookTableEntity> all() {
		List<BookTableEntity> results = bookTableRepository.findAll();
		return results;
	}

	@GetMapping("/{id}")
	public BookTableEntity id(@PathVariable Integer id) {
		Optional<BookTableEntity> result = bookTableRepository.findById(id);
		return result.orElse(new BookTableEntity());
	}

	@GetMapping("/{id}/author")
	public AuthorTableEntity author(@PathVariable Integer id) {
		Optional<BookTableEntity> result = bookTableRepository.findById(id);
		BookTableEntity book = result.orElse(new BookTableEntity());
		return book.getAuthor();
	}

	@GetMapping("/{id}/publisher")
	public PublisherTableEntity publisher(@PathVariable Integer id) {
		Optional<BookTableEntity> result = bookTableRepository.findById(id);
		BookTableEntity book = result.orElse(new BookTableEntity());
		return book.getPublisher();
	}
}
