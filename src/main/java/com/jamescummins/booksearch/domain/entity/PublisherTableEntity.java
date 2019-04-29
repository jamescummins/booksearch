package com.jamescummins.booksearch.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
//@Table(name = "publisher")
public class PublisherTableEntity{

	
	@Id
	@Column(name = "publisher_id", nullable = false)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	
}
