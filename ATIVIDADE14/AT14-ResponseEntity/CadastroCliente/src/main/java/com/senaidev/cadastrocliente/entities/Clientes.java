package com.senaidev.cadastrocliente.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_clientes")
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_clientes;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "rg")
	private String rg;
	
	@Column(name = "email")
	private String email;
	
	//construtores
	public Clientes() {
		
	}
	public Clientes (Long id_clientes, String nome, String cpf, String rg, String email) {
		this.id_clientes = id_clientes;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
	}
	public Long getId_clientes() {
		return id_clientes;
	}
	public void setId_clientes(Long id_clientes) {
		this.id_clientes = id_clientes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
