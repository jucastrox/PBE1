package com.senaidev.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.livraria.entitie.Livro;
import com.senaidev.livraria.service.LivroService;

@RestController
@RequestMapping("/Livro")
public class LivroController {
    
    @Autowired
    private LivroService LivroService;
    
    @PostMapping
    public Livro createLivro(Livro Livro) {
        return LivroService.saveLivro(Livro);
    }
    
    @GetMapping
    public List<LivroController> getAllLivro(){
        return LivroService.getAllLivros();
    }
    @GetMapping ("/{id_livro}")
    public LivroController getLivro(@PathVariable Long id_livro) {
        return LivroService.getLivroById(id_livro);
    }
    @DeleteMapping("/{id_livro}")
    public void deleteLivro (@PathVariable Long id_livro) {
        LivroService.deleteLivro(id_livro);
    }

}
