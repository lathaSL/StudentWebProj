package com.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {

	@Autowired
	StudentRepo stuRepo;
	
	public Student insert(Student st) {
		return stuRepo.save(st);
	}
	public List<Student> listAll(){
		
		return stuRepo.findAll();
	}
}
