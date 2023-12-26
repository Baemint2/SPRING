package com.mozi.rest.webservices.restfulwebservices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mozi.rest.webservices.restfulwebservices.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Post {
	
	public Post() {
		
	}
	
	@Id
	@GeneratedValue
	private Integer id;
	private String description;
	
	@Size(min=10)
	public Post(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}


	
	

}
