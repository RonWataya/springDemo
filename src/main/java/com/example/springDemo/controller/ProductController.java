package com.example.springDemo.controller;

import com.example.springDemo.entity.*;
import com.example.springDemo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private BranchesService branch_service;
    private CedantsService cedants_service;
    private CountryService country_service;
    private SlipsService slipservice;

    //Rest service for Slips Premiums

    @PostMapping("/addSlipsPremiums")
    public SlipsPremium addSlipsPremium(@RequestBody SlipsPremium slip){
        return slipservice.saveSlip(slip);
    }

    @GetMapping("/slips/{reference}")
    public SlipsPremium findByReference(@PathVariable String reference){
        return slipservice.getSlipsByReference(reference);
    }

    @GetMapping("/slips/{validation}")
    public SlipsPremium findByValidation(@PathVariable String validation){
        return slipservice.getSlipsByValidation(validation);
    }

    @GetMapping("/slips/{confirmation}")
    public SlipsPremium findByConfirmation(@PathVariable String confirmation){
        return slipservice.getSlipsByConfirmation(confirmation);
    }

    @GetMapping("/slips/{publication}")
    public SlipsPremium findByPublication(@PathVariable String publication){
        return slipservice.getSlipsByPublication(publication);
    }


    //Rest service for getting Countries

    @PostMapping("/addCountry")
    public Country addCountry(@RequestBody Country country){
        return country_service.saveCountry(country);
    }
    @GetMapping("/countries/{name}")
    public Country findCountryByName(@PathVariable String name){
        return country_service.getCountryByName(name);
    }

    //Rest service for getting cedants

    @PostMapping("/addCedants")
    public Cedants addCedants(@RequestBody Cedants cedants){
        return cedants_service.saveCedant(cedants);
    }
    @GetMapping("/cedants/{name}")
    public Cedants findCedantsByName(@PathVariable String name){
        return cedants_service.getCedantsByName(name);
    }

    //Rest service for getting branches

    @PostMapping("/addBranches")
    public Branches addBranches(@RequestBody Branches branches){
        return branch_service.saveBranch(branches);
    }
    @GetMapping("/branches/{name}")
    public Branches findBranchByName(@PathVariable String name){
        return branch_service.getBranchesByName(name);
    }





}
