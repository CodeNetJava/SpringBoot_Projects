package com.sau.studentRestAPI.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sau.studentRestAPI.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
