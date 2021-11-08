package com.loca.modal;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "Immobiliers")
public class Immobilier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_id")
	private long id;

	@Column(name = "_immobiliername", unique = true)
	private String immobiliername;

	@Column(name = "_password")
	private String password;

	@Column(name = "_name")
	private String name;

	@Column(name = "_email")
	private String email;

	private boolean immobilier;

	
	public Immobilier() {
		super();
	}

	public Immobilier(String immobiliername, String password, String name, String email, boolean immobilier) {
		super();
		this.immobiliername = immobiliername;
		this.password = password;
		this.name = name;
		this.email = email;
		this.immobilier = immobilier;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImmobiliername() {
		return immobiliername;
	}

	public void setImmobiliername(String username) {
		this.immobiliername = username;
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

	public boolean isImmobilier() {
		return immobilier;
	}

	public void setImmobilier(boolean immobilier) {
		this.immobilier = immobilier;
	}

	
}
