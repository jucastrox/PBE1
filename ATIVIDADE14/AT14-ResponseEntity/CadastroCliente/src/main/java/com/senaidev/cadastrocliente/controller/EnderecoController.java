package com.senaidev.cadastrocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastrocliente.entities.Endereco;
import com.senaidev.cadastrocliente.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	@Autowired
    private EnderecoService EnderecoService;
    
    @PostMapping
    public Endereco createEndereco(Endereco Endereco) {
        return EnderecoService.saveEndereco(Endereco);
    }
    
    @GetMapping
    public List<Endereco> getAllEndereco(){
        return EnderecoService.getAllEndereco();
    }
    @GetMapping("/{id_endereco}")
    public ResponseEntity<Endereco> getEndereco(@PathVariable Long id_endereco) {
    	Endereco Endereco = EnderecoService.getEnderecoById(id_endereco);
    	if (Endereco != null) {
    		return ResponseEntity.ok(Endereco);
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @DeleteMapping("/{id_endereco}")
    public void deleteEndereco(@PathVariable Long id_endereco) {
        EnderecoService.deleteEndereco(id_endereco);
    }
}
