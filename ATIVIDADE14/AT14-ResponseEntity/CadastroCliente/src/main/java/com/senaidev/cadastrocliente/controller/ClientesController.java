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

import com.senaidev.cadastrocliente.entities.Clientes;
import com.senaidev.cadastrocliente.service.ClientesService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	@Autowired
    private ClientesService ClientesService;
    
    @PostMapping
    public Clientes createClientes(Clientes Clientes) {
        return ClientesService.saveClientes(Clientes);
    }
    
    @GetMapping
    public List<Clientes> getAllCategoria(){
        return ClientesService.getAllClientes();
    }
    
    @GetMapping("/{id_clientes}")
    public ResponseEntity<Clientes> getClientes(@PathVariable Long id_clientes) {
    	Clientes Clientes = ClientesService.getClientesById(id_clientes);
    	if (Clientes != null) {
    		return ResponseEntity.ok(Clientes);
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @DeleteMapping("/{id_clientes}")
    public void deleteCategoria(@PathVariable Long id_clientes) {
        ClientesService.deleteClientes(id_clientes);
    }

}
