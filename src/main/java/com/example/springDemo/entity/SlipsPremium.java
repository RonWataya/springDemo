package com.example.springDemo.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SlipsPremiums")


public class SlipsPremium {

    @Id
    @GeneratedValue
    private int id;
    private String reference;
    private String validation;
    private String confirmation;
    private String publication;
}
