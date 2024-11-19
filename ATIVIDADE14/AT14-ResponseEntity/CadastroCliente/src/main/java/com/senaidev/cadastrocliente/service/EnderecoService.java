package com.senaidev.cadastrocliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Endereco;
import com.senaidev.cadastrocliente.repository.EnderecoRepository;

@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository EnderecoRepository;
	
	public Endereco saveEndereco(Endereco Endereco) {
		return EnderecoRepository.save(Endereco);
	}
	
	public List<Endereco> getAllEndereco(){
		return EnderecoRepository.findAll();
	}
	
	public Endereco getEnderecoById(Long id_endereco) {
		return EnderecoRepository.findById(id_endereco).orElse(null);
	}
	
	public void deleteEndereco(Long id_endereco) {
		EnderecoRepository.deleteById(id_endereco);
	}

}
