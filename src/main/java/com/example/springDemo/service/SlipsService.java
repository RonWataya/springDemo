package com.example.springDemo.service;

import com.example.springDemo.entity.SlipsPremium;
import com.example.springDemo.repository.SlipsPremiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlipsService {
    @Autowired
    private SlipsPremiumRepository repository;
    public SlipsPremium saveSlip(SlipsPremium slip){
        return repository.save(slip);
    }

    public List<SlipsPremium> saveSlips(List<SlipsPremium> slips){
        return repository.saveAll(slips);
    }
    public List<SlipsPremium> getSlips(){
        return repository.findAll();
    }
    public SlipsPremium getSlipsByReference(String reference){
        return repository.findByReference(reference);
    }

    public SlipsPremium getSlipsByValidation(String validation){
        return repository.findByValidation(validation);
    }
    public SlipsPremium getSlipsByConfirmation(String confirmation){
        return repository.findByConfirmation(confirmation);
    }
    public SlipsPremium getSlipsByPublication(String publication){
        return repository.findByPublication(publication);
    }



}
