package com.senaidev.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.livraria.entitie.Editora;
import com.senaidev.livraria.service.EditoraService;

@RestController
@RequestMapping("/Editora")
public class EditoraController {
    
    @Autowired
    private EditoraService EditoraService;
    
    @PostMapping
    public Editora createEditora(Editora Editora) {
        return EditoraService.saveEditora(Editora);
    }
    
    @GetMapping
    public List<EditoraController> getAllEditoras(){
        return EditoraService.getAllEditoras();
    }
    @GetMapping ("/{id_editora}")
    public EditoraController getEditora(@PathVariable Long id_editora) {
        return EditoraService.getEditoraById(id_editora);
    }
    @DeleteMapping("/{id_editora}")
    public void deleteEditora (@PathVariable Long id_editora) {
        EditoraService.deleteEditora(id_editora);
    }
}
