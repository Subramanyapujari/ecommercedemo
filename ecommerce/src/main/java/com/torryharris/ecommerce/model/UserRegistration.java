package com.torryharris.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserRegistration {
	@Id
	@GeneratedValue
	private int userId;
	private String firstname;
	private String lastname;
	private String middlename;
	@Column(unique = true)
	private String username;
	private String email;
	private String password;
	
	public UserRegistration(String firstname, String lastname, String middlename, String username, String email,
			String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public UserRegistration() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	@Override
	public String toString() {
		return "UserRegistration [firstname=" + firstname + ", lastname=" + lastname + ", middlename=" + middlename
				+ ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
