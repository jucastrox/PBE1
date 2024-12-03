package com.senaidev.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria.controller.EditoraController;
import com.senaidev.livraria.entitie.Editora;

public interface EditoraRepository extends JpaRepository<EditoraController, Long>{

	Editora save(Editora editora);


}
