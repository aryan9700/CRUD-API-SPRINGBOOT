package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.Student;
import com.spring.repository.StudentRepo;

@Service
public class DetailService {
	@Autowired
 private StudentRepo detailsrepo;
	
	public Student saveStudent(Student detail) {
		return detailsrepo.save(detail);
	}
	public List<Student> saveAllStudent(List<Student> details) {
		return detailsrepo.saveAll(details);
	}
	
	public List<Student> getDetails() {
		return detailsrepo.findAll();
	}
	
	public Student getDetailById(Long studentId) {
		return detailsrepo.findById(studentId).orElse(null);
	}
	
	public Student getDetailByName(String studentName) {
		return detailsrepo.findByStudentName(studentName);
	}
	
	public String deleteStudentDetails(Long studentId) {
		detailsrepo.deleteById(studentId);
		return "product removed successfully!! "+ studentId;
	}
	
	 public Student updateStudentDetails(Student detail) {
		 Student existingDetails = detailsrepo.findById(detail.getStudentId()).orElse(null);
		 existingDetails.setStudentName(detail.getStudentName());
		 existingDetails. setStudentBranch(detail.getStudentBranch());
	        return detailsrepo.save(existingDetails);
	    }

		
	}
	
