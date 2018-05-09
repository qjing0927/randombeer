package com.randombeer.randombeer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beer")
public class Beer {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int percentage;
	private String location;
	private String description;
	private String imagelink;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPercentage() {
		return percentage;
	}

	public String getLocation() {
		return location;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImagelink() {
		return imagelink;
	}

	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}
}
