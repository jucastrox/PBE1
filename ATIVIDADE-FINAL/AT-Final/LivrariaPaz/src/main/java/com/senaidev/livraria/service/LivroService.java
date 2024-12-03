package com.senaidev.livraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.livraria.controller.LivroController;
import com.senaidev.livraria.entitie.Livro;
import com.senaidev.livraria.repository.LivroRepository;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository LivroRepository;
    
    public Livro saveLivro(Livro Livro) {
        return LivroRepository.save(Livro);
    }
    
    public List<LivroController> getAllLivros(){
        return LivroRepository.findAll();
    }
    public LivroController getLivroById (Long id_livro) {
        return LivroRepository.findById(id_livro).orElse(null);
    }
    public void deleteLivro(Long id_livro) {
        LivroRepository.deleteById(id_livro);
    }
	
}
