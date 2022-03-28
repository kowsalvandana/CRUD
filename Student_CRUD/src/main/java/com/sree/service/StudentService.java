package com.sree.service;

import java.util.List;

import com.sree.model.Student;

public interface StudentService {
	Integer saveStudent(Student s);
	List<Student> getAllStudents();
	Student getOneStudent(Integer Sid);
	void deleteStudent(Integer Sid);
}
