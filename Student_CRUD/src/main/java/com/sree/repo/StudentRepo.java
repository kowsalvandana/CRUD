package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
