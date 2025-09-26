package com.project.services.exceptions;

// metodo para lançar erros personalizados na hora do consumo da api
public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(Object id){
        super("Resource not found. id " + id);
    }
}
