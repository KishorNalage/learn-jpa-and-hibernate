package com.kishor.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kishor.springboot.learn_jpa_and_hibernate.course.jpa.entity.Course;


@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {
	//CommandLineRunner : is a interface provide run method use for executes code at initializing spring Boot Application.

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		//repository.insert(new Course);
		repository.save(new Course(1,"Learn AWS Data JPA","In28minutes"));
		repository.save(new Course(2,"Learn Azure Data JPA","In28minutes"));
		repository.save(new Course(3,"Learn DevOps Data JPA","In28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("In28minutes"));
		System.out.println(repository.findByName("Learn DevOps Data JPA"));

	}



}
