package com.senaidev.livraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.livraria.controller.EditoraController;
import com.senaidev.livraria.entitie.Editora;
import com.senaidev.livraria.repository.EditoraRepository;

@Service
public class EditoraService {
    
    @Autowired
    private EditoraRepository EditoraRepository;
    
    public Editora saveEditora(Editora Editora) {
        return EditoraRepository.save(Editora);
    }
    
    public List<EditoraController> getAllEditoras(){
        return EditoraRepository.findAll();
    }
    public EditoraController getEditoraById (Long id_editora) {
        return EditoraRepository.findById(id_editora).orElse(null);
    }
    public void deleteEditora(Long id_editora) {
        EditoraRepository.deleteById(id_editora);
    }
}
