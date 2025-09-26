package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.User;
import com.project.repositories.UserRepository;
import com.project.services.exceptions.ResourceNotFoundException;

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
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user){
        return repository.save(user);
    }

    public void delet(Long id){
        repository.deleteById(id);
    }

    public User update(Long id, User user){
        User entity = repository.getReferenceById(id);
        updateDate(entity, user);
        return repository.save(entity);
    }

    private void updateDate(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }

    

}
