package com.everis.servicioA.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.servicioA.entity.Classes;
import com.everis.servicioA.repository.ClassesRepository;
import com.everis.servicioA.repository.ClassesStudentRepository;
import com.everis.servicioA.service.ClassesService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class ClassesServiceImpl implements ClassesService{

	@Autowired
	private ClassesRepository classesRepository;
	
	@Autowired
	private ClassesStudentRepository classesStudentRepository;
	
	@Transactional
	@Override
	public Classes saveClasses(Classes clas) {

		Classes room = classesRepository.save(clas);
		
		clas.getClassesStudent().forEach(StudentClasses -> StudentClasses.setClassesReference(room));
		
		classesStudentRepository.saveAll(clas.getClassesStudent());
		
		log.info("Se crea la clase");
		return room;
	}

	@Override
	public List<Classes> listClasses() {

		log.debug("Se obtienen todas las clases ");
		return classesRepository.findAll();
	}

	@Override
	public Classes findClasses(int id) {

		log.debug("Se obtiene la clase con id:" + id);
		return classesRepository.findById(id).get();
	}

	@Override
	public void deleteClasses(int id) {

		log.debug("Se elimina la clase con id:" + id);
		classesRepository.deleteById(id);
		
	}

	
	
}
