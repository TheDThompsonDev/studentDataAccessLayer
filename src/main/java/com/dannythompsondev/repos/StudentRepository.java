package com.dannythompsondev.repos;

import com.dannythompsondev.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}