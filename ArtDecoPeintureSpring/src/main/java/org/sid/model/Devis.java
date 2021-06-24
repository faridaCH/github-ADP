package org.sid.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Devis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private LocalDateTime timeStamp;
	private  String messages;
	
	public Devis() {
		super();
	}

	public Devis(String nom, String prenom, String tel, String email, LocalDateTime timeStamp, String messages) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.timeStamp=LocalDateTime.now();
		this.messages = messages;
	}

	public Devis(String nom, String prenom, String tel, String email, String messages) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.messages = messages;
		this.timeStamp=LocalDateTime.now();
	}

	public Devis(String nom, String prenom, String tel, String messages) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.messages = messages;
		this.timeStamp=LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}


	
}
