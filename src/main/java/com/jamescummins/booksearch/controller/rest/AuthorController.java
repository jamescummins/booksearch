package com.jamescummins.booksearch.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jamescummins.booksearch.domain.entity.AuthorTableEntity;
import com.jamescummins.booksearch.repository.AuthorTableRepository;

@RestController
@RequestMapping(value = { "/authors" })
public class AuthorController {

	@Autowired
	private AuthorTableRepository authorTableRepository;
	
	@PostMapping("/")
	public List<AuthorTableEntity> all() {
		List<AuthorTableEntity> results = authorTableRepository.findAll();
		return results;
	}

	@PostMapping("/{id}")
	public AuthorTableEntity id(@RequestParam Integer id) {
		Optional<AuthorTableEntity> result = authorTableRepository.findById(id);
		return result.get();
	}
}
