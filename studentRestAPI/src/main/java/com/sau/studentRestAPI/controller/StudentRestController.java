package com.sau.studentRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sau.studentRestAPI.entities.Student;
import com.sau.studentRestAPI.repos.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	StudentRepository repos;

// add student
@RequestMapping(value="/students",method=RequestMethod.POST)	
	public void createStudent(@RequestBody Student student) {
	repos.save(student);
	}
// find all students
@RequestMapping(value="/students",method=RequestMethod.GET)
public List<Student> getStudents(){
	return repos.findAll();
}

//find student by id
@RequestMapping(value="/students/{id}",method=RequestMethod.GET)
public Student getStudent(@PathVariable("id") int id) {
	return repos.findById(id).get();
}

//delete student by id
@RequestMapping(value="/students/{id}",method=RequestMethod.DELETE)
public void deleteStudent(@PathVariable("id") int id) {
	repos.deleteById(id);
}

//update student
@RequestMapping(value="/students",method=RequestMethod.PUT)
public void updateStudent(@RequestBody Student student) {
	repos.save(student);
}
}
