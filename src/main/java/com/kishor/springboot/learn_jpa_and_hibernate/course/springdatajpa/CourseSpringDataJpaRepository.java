package com.kishor.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishor.springboot.learn_jpa_and_hibernate.course.jpa.entity.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

	public List<Course> findByAuthor(String author);
	public List<Course> findByName(String name);
}
