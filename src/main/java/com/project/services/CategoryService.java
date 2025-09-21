package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Category;
import com.project.repositories.CategoryRepository;


@Service
public class CategoryService {
    
    // injeçao de dependecia para eu nao precisar instanciar um objeto
    @Autowired
    private CategoryRepository repository;

    // metodo para buscar todos os meus usuarios no banco de dados
    public List<Category> findAll(){
        return repository.findAll();
    }

    // metodo para buscar por id
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
