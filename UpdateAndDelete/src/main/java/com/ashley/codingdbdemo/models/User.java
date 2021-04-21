package com.ashley.codingdbdemo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "users")
public class User {
	// MEMBER VVARIABLES
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull // MAKING SURE THE USER PROVIDEDS A NAME
	@Size(min = 2, max = 40) //MAKING SURE THE USER NAME IS A PROPER SIZE
	private String name;
		
	@NotNull
	@Email //making sure it's an email address using the std format
	private String email;
	
	@NotNull
	@Size(min = 8, max = 16, message="Check the size requirements")
	private String password;
	
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	
	private Date updatedAt;
	// CONSTRUCTORS
	public User() {
		
	}
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	
	// GETTERS AND SETTERS
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	//UPDATES THE CREEATED AT AND UPDATED AT
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date ();
		}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date ();
	}
	

	
	
}
