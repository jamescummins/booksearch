package com.jamescummins.booksearch.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jamescummins.booksearch.domain.entity.BookTableEntity;
import com.jamescummins.booksearch.repository.BookTableRepository;

@RestController
@RequestMapping(value = { "/books" })
public class BookController {

	@Autowired
	private BookTableRepository bookTableRepository;
	
	@PostMapping("/")
	public List<BookTableEntity> all() {
		List<BookTableEntity> results = bookTableRepository.findAll();
		return results;
	}

	@PostMapping("/{id}")
	public BookTableEntity id(@RequestParam Integer id) {
		Optional<BookTableEntity> result = bookTableRepository.findById(id);
		return result.get();
	}
}
