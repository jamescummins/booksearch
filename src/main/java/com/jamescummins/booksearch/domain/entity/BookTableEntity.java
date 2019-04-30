package com.jamescummins.booksearch.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
@Table(name = "book")
public class BookTableEntity{

	
	@Id
	@Column(name = "book_id", nullable = false)
	private Integer id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="isdn")
	private String isdn;
	
	@Column(name="year")
	private String year;
	
	@ManyToOne
	@JoinColumn(name = "author_id", nullable = false)
	private AuthorTableEntity author;
	
	@ManyToOne
	@JoinColumn(name = "publisher_id", nullable = false)
	private PublisherTableEntity publisher;

	
	
}
