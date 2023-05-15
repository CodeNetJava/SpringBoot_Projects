package com.sau.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sau.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
