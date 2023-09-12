package com.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id // clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// identity = auto increment 1,2,3...
	// auto pour uniquement les chaine chaine aléatoire automatique
	private long id;
	@Column(nullable = false, length = 30)
	private String nom,prenom;
	@Column(nullable = false)
	private String mdp;
	@Column(unique = true)
	private String email;
	
	private int age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", age=" + age + "]";
	}
	
	
	
	

}
