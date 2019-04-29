package com.jamescummins.booksearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jamescummins.booksearch.domain.entity.PublisherTableEntity;

@Repository
public interface PublisherTableRepository extends JpaRepository<PublisherTableEntity, Integer> {

}
