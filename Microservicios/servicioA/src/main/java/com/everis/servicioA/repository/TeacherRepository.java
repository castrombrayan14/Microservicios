package com.everis.servicioA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.servicioA.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
