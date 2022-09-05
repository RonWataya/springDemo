package com.example.springDemo.service;

import com.example.springDemo.entity.Country;
import com.example.springDemo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository repository;
    public Country saveCountry(Country countries){
        return repository.save(countries);
    }

    public List<Country> saveCountries(List<Country> countries){
        return repository.saveAll(countries);
    }
    public List<Country> getCountries(){
        return repository.findAll();
    }
    public Country getcountryById(int id){
        return repository.findById(id).orElse(null);
    }

    public Country getCountryByName(String name){
        return repository.findByName(name);
    }

}
