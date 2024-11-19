package com.senaidev.cadastrocliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Telefone;
import com.senaidev.cadastrocliente.repository.TelefoneRepository;

@Service
public class TelefoneService {
	@Autowired
	private TelefoneRepository TelefoneRepository;
	
	public Telefone saveTelefone(Telefone Telefone) {
		return TelefoneRepository.save(Telefone);
	}
	
	public List<Telefone> getAllTelefone(){
		return TelefoneRepository.findAll();
	}
	
	public Telefone getTelefoneById(Long id_telefone) {
		return TelefoneRepository.findById(id_telefone).orElse(null);
	}
	
	public void deleteTelefone(Long id_telefone) {
		TelefoneRepository.deleteById(id_telefone);
	}
	
}
