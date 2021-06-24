package org.sid.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
//	private String nom;
//	private String prenom;
//	private String tel;	
//	private LocalDateTime timeStamp;
//	private  String messages;
	private String email;
	private String motdepasse
	;
	public Admin(String email, String motdepasse) {
		super();
		this.email = email;
		this.motdepasse = motdepasse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
