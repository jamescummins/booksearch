package com.jamescummins.booksearch.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jamescummins.booksearch.domain.entity.PublisherTableEntity;
import com.jamescummins.booksearch.repository.PublisherTableRepository;


@RestController
@RequestMapping(value = { "/publishers" })
public class PublisherController {

	@Autowired
	private PublisherTableRepository publisherTableRepository;

	@GetMapping(path = {"","/"})
	public List<PublisherTableEntity> all() {
		List<PublisherTableEntity> results = publisherTableRepository.findAll();
		return results;
	}

	@GetMapping("/{id}")
	public PublisherTableEntity id(@PathVariable Integer id) {
		Optional<PublisherTableEntity> result = publisherTableRepository.findById(id);
		return result.orElse(new PublisherTableEntity());
	}
}
