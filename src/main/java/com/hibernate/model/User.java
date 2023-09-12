package com.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String nomComplet;

private String adresse;
@Column(nullable = false)
private String telephone;
@Min(value = 18)
private int age;



public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNomComplet() {
	return nomComplet;
}
public void setNomComplet(String nomComplet) {
	this.nomComplet = nomComplet;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}

}
