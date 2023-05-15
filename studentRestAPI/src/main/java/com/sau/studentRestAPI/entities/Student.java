package com.sau.studentRestAPI.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)

int id;
String name;
int testscore;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTestscore() {
	return testscore;
}
public void setTestscore(int testscore) {
	this.testscore = testscore;
}
}
