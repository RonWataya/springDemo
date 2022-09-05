package com.example.springDemo.service;

import com.example.springDemo.entity.Cedants;
import com.example.springDemo.repository.CedantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CedantsService {
    @Autowired
    private CedantsRepository repository;
    public Cedants saveCedant(Cedants cedants){
        return repository.save(cedants);
    }

    public List<Cedants> saveCedants(List<Cedants> cedants){
        return repository.saveAll(cedants);
    }
    public List<Cedants> getCedants(){
        return repository.findAll();
    }
    public Cedants getCedantsById(int id){
        return repository.findById(id).orElse(null);
    }

    public Cedants getCedantsByName(String name){
        return repository.findByName(name);
    }

}
