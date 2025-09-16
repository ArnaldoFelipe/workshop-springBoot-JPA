package com.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.User;

// classe com recursos para a aplicaçao web
@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    // metodo que responde a requisao tipo get do http trazendo um usuario
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1l, "joao", "joao@gmail.com", "999999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
