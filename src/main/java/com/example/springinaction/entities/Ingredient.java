package com.example.springinaction.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC,force = true)
public class Ingredient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private final String method;
    private final String name;
    private final Type type;

    public static enum Type
    {
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
