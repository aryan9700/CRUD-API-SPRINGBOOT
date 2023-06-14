package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.entities.Student;
import com.spring.service.DetailService;


@RestController
public class StudentControllers {
	@Autowired
	    private DetailService detailservice;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student detail) {
        return detailservice.saveStudent(detail);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> details) {
        return detailservice.saveAllStudent(details);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return detailservice.getDetails();
    }

    @GetMapping("/detailById/{studentId}")
    public Student findStudentById(@PathVariable Long studentId) {
        return detailservice.getDetailById(studentId);
    }

    @GetMapping("/detailByName/{studentName}")
    public Student findStudentByName(@PathVariable String studentName) {
        return detailservice.getDetailByName(studentName);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student details) {
        return detailservice.updateStudentDetails(details);
    }

    @DeleteMapping("/delete/{studentId}")
    public String deleteStudent(@PathVariable Long studentId) {
        return detailservice.deleteStudentDetails(studentId);
    }
}