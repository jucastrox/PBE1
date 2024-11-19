package com.senaidev.cadastrocliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Clientes;
import com.senaidev.cadastrocliente.repository.ClientesRepository;

@Service
public class ClientesService {
	@Autowired
	private ClientesRepository ClientesRepository;
	
	public Clientes saveClientes(Clientes Clientes) {
		return ClientesRepository.save(Clientes);
	}
	
	public List<Clientes> getAllClientes(){
		return ClientesRepository.findAll();
	}
	
	public Clientes getClientesById(Long id_clientes) {
		return ClientesRepository.findById(id_clientes).orElse(null);
	}
	
	public void deleteClientes(Long id_clientes) {
		ClientesRepository.deleteById(id_clientes);
	}

}
