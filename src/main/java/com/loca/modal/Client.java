package com.loca.modal;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_id")
	private long id;

	@Column(name = "_clientname", unique = true)
	private String clientname;

	@Column(name = "_password")
	private String password;

	@Column(name = "_name")
	private String name;

	@Column(name = "_email")
	private String email;

	private boolean client;

	
	public Client() {
		super();
	}

	public Client(String clientname, String password, String name, String email, boolean client) {
		super();
		this.clientname = clientname;
		this.password = password;
		this.name = name;
		this.email = email;
		this.client = client;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String username) {
		this.clientname = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public boolean isClient() {
		return client;
	}

	public void setClient(boolean client) {
		this.client = client;
	}

	
}
