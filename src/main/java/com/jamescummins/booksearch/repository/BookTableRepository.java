package com.jamescummins.booksearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jamescummins.booksearch.domain.entity.BookTableEntity;

@Repository
public interface BookTableRepository extends JpaRepository<BookTableEntity, Integer> {

}
