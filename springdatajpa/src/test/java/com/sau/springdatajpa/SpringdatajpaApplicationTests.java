package com.sau.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sau.springdatajpa.entities.Student;
import com.sau.springdatajpa.repos.StudentRepository;

import static org.junit.Assert.*;

@SpringBootTest
class SpringdatajpaApplicationTests {
	
	@Autowired //inject StudentRepository
	private StudentRepository repo; 

	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1L);
		student.setName("savita");
		student.setTestScore(100);
		repo.save(student); //saved to database // save is crud method that we are able to access here
		Student savedStudent = repo.findById(1L).get(); // retriving from database
		assertNotNull(savedStudent); // cheking
		//crete, read, update,delete
		
		
	}

}
