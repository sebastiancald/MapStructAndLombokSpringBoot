package com.jhoncalderon.mapstructlombok.dto;

public class GetProduct {
	
	private Long id;
	
	private String name;
	
	private String creationDate;

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

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "GetProduct [id=" + id + ", name=" + name + ", creationDate=" + creationDate + "]";
	}
	
	

}
