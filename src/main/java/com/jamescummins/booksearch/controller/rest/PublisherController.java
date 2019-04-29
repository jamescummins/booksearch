package com.jamescummins.booksearch.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jamescummins.booksearch.domain.entity.PublisherTableEntity;
import com.jamescummins.booksearch.repository.PublisherTableRepository;


@RestController
@RequestMapping(value = { "/publisherS" })
public class PublisherController {

	@Autowired
	private PublisherTableRepository publisherTableRepository;

	@PostMapping("/")
	public List<PublisherTableEntity> all() {
		List<PublisherTableEntity> results = publisherTableRepository.findAll();
		return results;
	}

	@PostMapping("/{id}")
	public PublisherTableEntity id(@RequestParam Integer id) {
		Optional<PublisherTableEntity> result = publisherTableRepository.findById(id);
		return result.get();
	}
}
