package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Order;
import com.project.repositories.OrderRepository;

@Service
public class OrderService {
    
    // injeçao de dependecia para eu nao precisar instanciar um objeto
    @Autowired
    private OrderRepository repository;

    // metodo para buscar todos os meus usuarios no banco de dados
    public List<Order> findAll(){
        return repository.findAll();
    }

    // metodo para buscar por id
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
