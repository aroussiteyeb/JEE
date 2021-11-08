package com.loca.modal;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "Reclamations")
public class Reclamation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_id")
	private long id;

	@Column(name = "_reclamationname", unique = true)
	private String reclamationname;

	@Column(name = "_password")
	private String password;

	@Column(name = "_name")
	private String name;

	@Column(name = "_email")
	private String email;

	private boolean reclamation;

	
	public Reclamation() {
		super();
	}

	public Reclamation(String reclamationname, String password, String name, String email, boolean reclamation) {
		super();
		this.reclamationname = reclamationname;
		this.password = password;
		this.name = name;
		this.email = email;
		this.reclamation = reclamation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReclamationname() {
		return reclamationname;
	}

	public void setReclamationname(String username) {
		this.reclamationname = username;
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

	public boolean isReclamation() {
		return reclamation;
	}

	public void setReclamation(boolean reclamation) {
		this.reclamation = reclamation;
	}

	
}
