package com.example.springinaction.repositories;

import com.example.springinaction.entities.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco,Long> {
}
