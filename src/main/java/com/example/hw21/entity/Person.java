package com.example.hw21.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons", schema = "hibernate")
public class Person {

    @EmbeddedId
    private PersonId personId;

    @Column(length = 15)
    private String phoneNumber;

    @Column(length = 50)
    private String cityOfLiving;
}