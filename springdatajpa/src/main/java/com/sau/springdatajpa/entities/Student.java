package com.sau.springdatajpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // to make this class a jpa entity
public class Student {
	
@Id  // this below id field is typically a primary key in the data base // so mark with @Id annotation
      // every Jpa entity should have at least one @ID and class should be marked with @Entity
private long id;
private String name;
private int testScore;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTestScore() {
	return testScore;
}
public void setTestScore(int testScore) {
	this.testScore = testScore;
}

}
