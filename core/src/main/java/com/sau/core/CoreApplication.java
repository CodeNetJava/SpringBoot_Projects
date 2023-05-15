package com.sau.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication this is the top level annotation
// this has several other annotations in it // when you put a cursor on it you can see those annotations
//@SpringBootConfiguration, @EnableAutoCongiguration, @ComponentScan() these are important annotations in this annotation
// @SpringBootApplication this annotation will do all @SpringBootConfiguration, @EnableAutoCongiguration, @ComponentScan() for our com.sau.core package
@SpringBootApplication

//CoreApplication, class name, Core is derived from projct name and appends application to it
public class CoreApplication {
	// below is main method //this is where the execution of spring boot application begins
	public static void main(String[] args) {
		//SpringApplication.run // run is a static method within springBoot
		//in run method, we will pass this class name CoreApplication as a parameter 
		// we can pass any class here which is marked with annotation @SpringBootApplication
		SpringApplication.run(CoreApplication.class, args);
	}

}

/*@SpringBootConfiguration -> tells spring boot that this class here can have several beans definitions, 
so that those beans will be available at the run time*/
/*@EnableAutoCongiguration -> tells spring boot to automatically configure the spring application based on the dependencies*/
/* @ComponentScan()
	tells spring boot that scan this package, and figure out all the spring beans and create beans for us
	it will automatically scan all the sub packages of this package com.sau.core
*/