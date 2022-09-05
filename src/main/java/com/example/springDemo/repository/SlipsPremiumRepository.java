package com.example.springDemo.repository;

import com.example.springDemo.entity.SlipsPremium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlipsPremiumRepository extends JpaRepository<SlipsPremium, String> {

    SlipsPremium findByValidation(String validation);

    SlipsPremium findByConfirmation(String confirmation);

    SlipsPremium findByPublication(String publication);



    SlipsPremium findByReference(String reference);
}
