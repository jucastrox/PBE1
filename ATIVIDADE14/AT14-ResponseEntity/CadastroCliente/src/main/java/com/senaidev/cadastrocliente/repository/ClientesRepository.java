package com.senaidev.cadastrocliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastrocliente.entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
