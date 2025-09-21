package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Product;
import com.project.repositories.ProductRepository;


@Service
public class ProductService {
    
    // injeçao de dependecia para eu nao precisar instanciar um objeto
    @Autowired
    private ProductRepository repository;

    // metodo para buscar todos os meus usuarios no banco de dados
    public List<Product> findAll(){
        return repository.findAll();
    }

    // metodo para buscar por id
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
