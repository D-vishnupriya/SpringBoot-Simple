package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootSimpleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootSimpleApplication.class, args);
		Student sob=context.getBean(Student.class);
		//System.out.println(sob);
		sob.display();
		Course cob=context.getBean(Course.class);
		System.out.println(cob);
		cob.display();
	}

}
