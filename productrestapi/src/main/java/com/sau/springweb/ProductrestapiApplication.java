package com.sau.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class}) //normally springBoot enable @EnableAutoConfiguration with @SpringBootApplication
                                                                       //but if you don't want to configure some perticular class then use this annotation
public class ProductrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductrestapiApplication.class, args);
	}

}
