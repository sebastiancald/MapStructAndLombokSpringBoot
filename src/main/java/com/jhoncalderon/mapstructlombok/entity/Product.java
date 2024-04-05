package com.jhoncalderon.mapstructlombok.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private Long id;
	
	private String name;
	
	@Column(name="creation_date")
	private LocalDateTime creationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getAtCreate() {
		return creationDate;
	}

	public void setAtCreate(LocalDateTime atCreate) {
		creationDate = atCreate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", creationDate=" + creationDate + "]";
	}
	
	

}
