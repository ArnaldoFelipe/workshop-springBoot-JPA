package com.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.User;
import com.project.services.UserService;

// classe com recursos para a aplicaçao web
@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserService service;

    
    // metodo que responde a requisao tipo get do http trazendo um usuario
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
