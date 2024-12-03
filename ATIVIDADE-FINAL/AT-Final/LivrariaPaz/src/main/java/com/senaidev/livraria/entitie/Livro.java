package com.senaidev.livraria.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
public class Livro {
	//Atributos		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_livro;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "isbn")
	private String isbn;
	
	@Column(name = "genero")
	private String genero;
	
	@ManyToOne
    @JoinColumn(name = "EDITORA_id_editora")
    private Editora editora;
	
	//construtores
	public Livro() {
			
	}
	public Livro(Long id_livro, String titulo, String isbn, String genero) {
		this.id_livro = id_livro;
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
	}
	
	//getters e setters
	public Long getId_livro() {
		return id_livro;
	}
	public void setId_livro(Long id_livro) {
		this.id_livro = id_livro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}


