package com.kishor.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kishor.springboot.learn_jpa_and_hibernate.course.jpa.entity.Course;


//Enable if run it  @Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
	//CommandLineRunner : is a interface provide run method use for executes code at initializing spring Boot Application.

	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		//repository.insert(new Course);
		repository.insert(new Course(1,"Learn AWS JPA","In28minutes"));
		repository.insert(new Course(2,"Learn Azure JPA","In28minutes"));
		repository.insert(new Course(3,"Learn DevOps JPA","In28minutes"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));

	}

}
