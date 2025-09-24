package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.User;
import com.project.repositories.UserRepository;

@Service
public class UserService {
    
    // injeçao de dependecia para eu nao precisar instanciar um objeto
    @Autowired
    private UserRepository repository;

    // metodo para buscar todos os meus usuarios no banco de dados
    public List<User> findAll(){
        return repository.findAll();
    }

    // metodo para buscar por id
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User user){
        return repository.save(user);
    }

}
