package com.example.springDemo.repository;

import com.example.springDemo.entity.Cedants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CedantsRepository extends JpaRepository<Cedants, Integer> {
    Cedants findByName(String name);
}
