package com.example.springDemo.repository;

import com.example.springDemo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    Country findByName(String name);
}
