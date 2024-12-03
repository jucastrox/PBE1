package com.senaidev.livraria.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_editora")
public class Editora {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_editora;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "email")
	private String email;
	
	//construtores
	public Editora(){
		
	}
	public Editora(Long id_editora, String nome, String cnpj,String email) {
		this.id_editora = id_editora;
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
	}
	
	//getters and setters
	public Long getId_editora() {
		return id_editora;
	}
	public void setId_editora(Long id_editora) {
		this.id_editora = id_editora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
