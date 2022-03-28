package com.sree.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.Student;
import com.sree.repo.StudentRepo;
import com.sree.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo repo;

	@Override
	public Integer saveStudent(Student s) {
		
		return repo.save(s).getSid();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}

	@Override
	public Student getOneStudent(Integer Sid) {
		
		return repo.getOne(Sid);
	}

	@Override
	public void deleteStudent(Integer Sid) {
		repo.deleteById(Sid);
	}

}
