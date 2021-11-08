package com.loca.modal;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "Responsables")
public class Responsable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_id")
	private long id;

	@Column(name = "_responsablename", unique = true)
	private String responsablename;

	@Column(name = "_password")
	private String password;

	@Column(name = "_name")
	private String name;

	@Column(name = "_email")
	private String email;

	private boolean responsable;

	
	public Responsable() {
		super();
	}

	public Responsable(String responsablename, String password, String name, String email, boolean responsable) {
		super();
		this.responsablename = responsablename;
		this.password = password;
		this.name = name;
		this.email = email;
		this.responsable = responsable;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getResponsablename() {
		return responsablename;
	}

	public void setResponsablename(String username) {
		this.responsablename = username;
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

	public boolean isResponsable() {
		return responsable;
	}

	public void setResponsable(boolean responsable) {
		this.responsable = responsable;
	}

	
}
