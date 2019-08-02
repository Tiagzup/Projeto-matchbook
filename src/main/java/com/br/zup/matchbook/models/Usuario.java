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
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	@Size (min = 2, message = "O nome não pode ficar em branco.")
	private String nome;
	
	@NotBlank
	@Size (min = 2, message = "O Sobrenome não pode ficar em branco.")
	private String sobrenome;
	
	@NotNull(message = "O campo idade não pode estar em branco")
	@Min (value = 18, message = "Menores de 18 anos não podem utilizar o Mathbook.")
	private int idade;
	
	@NotBlank
	@Size (min = 2, message = "A cidade não pode ficar em branco.")
	private String cidade;
	
	
	@NotBlank
	@Size (min = 2, message = "O sexo não pode ficar em branco.")
	private String sexo;
	
	private GenerosLiterarios generosLiterarios;
	
	public Usuario () {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
