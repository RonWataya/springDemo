package com.example.springDemo.repository;

import com.example.springDemo.entity.Branches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchesRepository extends JpaRepository<Branches, Integer> {
    Branches findByName(String name);
}
