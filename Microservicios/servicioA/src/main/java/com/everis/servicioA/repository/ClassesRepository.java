package com.everis.servicioA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.servicioA.entity.Classes;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer>{

}
