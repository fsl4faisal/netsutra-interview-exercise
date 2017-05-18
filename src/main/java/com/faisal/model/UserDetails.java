package com.faisal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	int id;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="ADDRESS")
	String address;
	
	@ElementCollection(targetClass=String.class,fetch=FetchType.EAGER)
	@CollectionTable(name="HOBBIES",joinColumns=@JoinColumn(name="ID"))
	@Column(name="HOBBIES")
	List<String> hobbies=new ArrayList<String>();
	
	@Column(name="INTEREST")
	String interest;
	
	@OneToOne(cascade=CascadeType.ALL)
	UserLogin userLogin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	/**
	 * @return the hobbies
	 */
	public List<String> getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	/**
	 * @return the userLogin
	 */
	public UserLogin getUserLogin() {
		return userLogin;
	}

	/**
	 * @param userLogin the userLogin to set
	 */
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}
	
	
	
	
}
