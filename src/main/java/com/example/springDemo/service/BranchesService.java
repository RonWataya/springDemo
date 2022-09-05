package com.example.springDemo.service;

import com.example.springDemo.entity.Branches;
import com.example.springDemo.repository.BranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchesService {
    @Autowired
    private BranchesRepository repository;
    public Branches saveBranch(Branches branches){
        return repository.save(branches);
    }

    public List<Branches> saveBranches(List<Branches> branches){
        return repository.saveAll(branches);
    }
    public List<Branches> getBranches(){
        return repository.findAll();
    }
    public Branches getbranchesById(int id){
        return repository.findById(id).orElse(null);
    }

    public Branches getBranchesByName(String name){
        return repository.findByName(name);
    }

}
