package com.example.entity;

import lombok.Data;

@Data
//@Entity
//@Table(name = "etudiants")
public class Etudiant {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String prenom;
	private String nom;
	private String email;
	private int age;
	private String filiere;
	
	
	
	 
	public Etudiant() {
		super();
	}
	public Etudiant(long id, String prenom, String nom, String email, int age, String filiere) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.age = age;
		this.filiere = filiere;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	
	
}
