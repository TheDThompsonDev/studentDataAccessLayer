package com.dannythompsondev;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dannythompsondev.entities.Student;
import com.dannythompsondev.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Studentdal1ApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("java web services");
		student.setFee(30d);
		studentRepository.save(student);
	}
	
	@Test
	public void testFindById() {
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
	}
	@Test
	public void testUpdateStudent() {
		Student student = studentRepository.findById(1l).get();
        student.setFee(40d);
        studentRepository.save(student);
	}
}
