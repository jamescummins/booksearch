package com.jamescummins.booksearch.domain.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "author")
public class AuthorTableEntity{

	
	@Id
	@Column(name = "author_id", nullable = false)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private LocalDate dob;
}
