package com.br.zup.matchbook.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	@Size(min = 2, message = "O nome não pode ficar em branco.")
	private String name;

	@NotBlank
	@Size(min = 2, message = "O Sobrenome não pode ficar em branco.")
	private String lastName;

	@NotNull(message = "O campo idade não pode estar em branco")
	@Min(value = 18, message = "Menores de 18 anos não podem utilizar o Mathbook.")
	private int age;

	@NotBlank
	@Size(min = 2, message = "A cidade não pode ficar em branco.")
	private String city;

	@NotBlank
	@Size(min = 2, message = "O sexo não pode ficar em branco.")
	private String gender;

	private LiteraryGenre literaryGenre;

	public User() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LiteraryGenre getLiteraryGenre() {
		return literaryGenre;
	}

	public void setLiteraryGenre(LiteraryGenre literaryGenre) {
		this.literaryGenre = literaryGenre;
	}

}
