package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="PHONEBOOK")
@XmlRootElement
public class ContactDetails {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String phno;
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactDetails(Integer id, String name, String email, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer sid) {
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
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "ContactDetails [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}


}
