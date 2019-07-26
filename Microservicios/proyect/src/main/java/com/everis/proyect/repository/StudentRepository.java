package com.everis.proyect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.everis.proyect.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select s from Student s where s.studentId=?1")
	public Student findByStudentIdSQL(int	 id);
	
}
