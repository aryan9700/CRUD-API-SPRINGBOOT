package com.spring.entities;

import javax.persistence.*;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student_Details")
@Entity
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long studentId;
	
	@Column(name = "name")
	private String studentName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long studentId, String studentName, String studentBranch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentBranch=" + studentBranch
				+ "]";
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	@Column(name = "branch")
	private String studentBranch;
	
	
}