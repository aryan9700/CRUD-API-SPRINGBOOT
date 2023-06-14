package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

	Student findByStudentName(String studentName);

}
