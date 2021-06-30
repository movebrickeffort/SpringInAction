package com.example.springinaction.entities;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @NotNull
    @Size(min = 5,message = "Name must be at least 5 charcters long")
    private String name;
    private Date createdAt;
    @ManyToMany(targetEntity = Ingredient.class)
    @Size(min = 1,message = "You must choose at least 1 ingredient")
    private List<String> ingredients;
    void createdAt()
    {
        this.createdAt = new Date();
    }
}
