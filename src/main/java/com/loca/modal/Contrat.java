package com.loca.modal;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "Contrats")
public class Contrat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_id")
	private long id;

	@Column(name = "_contratname", unique = true)
	private String contratname;

	@Column(name = "_password")
	private String password;

	@Column(name = "_name")
	private String name;

	@Column(name = "_email")
	private String email;

	private boolean contrat;

	
	public Contrat() {
		super();
	}

	public Contrat(String contratname, String password, String name, String email, boolean contrat) {
		super();
		this.contratname = contratname;
		this.password = password;
		this.name = name;
		this.email = email;
		this.contrat = contrat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContratname() {
		return contratname;
	}

	public void setContratname(String username) {
		this.contratname = username;
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

	public boolean isContrat() {
		return contrat;
	}

	public void setContrat(boolean contrat) {
		this.contrat = contrat;
	}

	
}
