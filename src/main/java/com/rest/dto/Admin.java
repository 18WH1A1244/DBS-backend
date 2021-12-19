package com.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIgnoreProperties(allowSetters = true, value = { "orderList" })
@XmlRootElement
@Entity
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="farmerId")
public class Admin {
	@Id@GeneratedValue
	private String AdminName;
	private String address;
	private String mobile;
	private String password;
	
	//private String passbookId;


	//@JsonIgnore
	@OneToMany(mappedBy="Admin", cascade=CascadeType.ALL)
	//@Fetch(value = FetchMode.SUBSELECT)

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String AdminName) {
		this.AdminName = AdminName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	
	
	
}