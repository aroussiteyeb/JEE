package com.loca.modal;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "Locataires")
public class Locataire implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_id")
	private long id;

	@Column(name = "_locatairename", unique = true)
	private String locatairename;

	@Column(name = "_password")
	private String password;

	@Column(name = "_name")
	private String name;

	@Column(name = "_email")
	private String email;

	private boolean locataire;

	
	public Locataire() {
		super();
	}

	public Locataire(String locatairename, String password, String name, String email, boolean locataire) {
		super();
		this.locatairename = locatairename;
		this.password = password;
		this.name = name;
		this.email = email;
		this.locataire = locataire;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocatairename() {
		return locatairename;
	}

	public void setLocatairename(String username) {
		this.locatairename = username;
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

	public boolean isLocataire() {
		return locataire;
	}

	public void setLocataire(boolean locataire) {
		this.locataire = locataire;
	}

	
}
