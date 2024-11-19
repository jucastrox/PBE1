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

import com.senaidev.cadastrocliente.entities.Telefone;
import com.senaidev.cadastrocliente.service.TelefoneService;

@RestController
@RequestMapping("/telefone")
public class TelefoneController {
	@Autowired
    private TelefoneService TelefoneService;
    
    @PostMapping
    public Telefone createTelefone(Telefone Telefone) {
        return TelefoneService.saveTelefone(Telefone);
    }
    
    @GetMapping
    public List<Telefone> getAllTelefone(){
        return TelefoneService.getAllTelefone();
    }
    @GetMapping("/{id_telefone}")
    public ResponseEntity<Telefone> getTelefone(@PathVariable Long id_telefone) {
    	Telefone Telefone = TelefoneService.getTelefoneById(id_telefone);
    	if (Telefone != null) {
    		return ResponseEntity.ok(Telefone);
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @DeleteMapping("/{id_telefone}")
    public void deleteTelefone(@PathVariable Long id_telefone) {
        TelefoneService.deleteTelefone(id_telefone);
    }

}
