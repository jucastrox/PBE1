package com.senaidev.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria.controller.LivroController;
import com.senaidev.livraria.entitie.Livro;

public interface LivroRepository extends JpaRepository<LivroController, Long>{

	Livro save(Livro livro);

}
