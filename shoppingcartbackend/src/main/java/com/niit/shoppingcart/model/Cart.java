package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Cart {

	
	
	private String id;


	private String name;

	private String description;

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(Integer price) {
		// TODO Auto-generated method stub
		
	}

	public void setProductName(String name2) {
		// TODO Auto-generated method stub
		
	}

	public void setQuantity(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setUserId(String loggedInUserid) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(char c) {
		// TODO Auto-generated method stub
		
	}

}
