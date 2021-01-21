package com.techsahrezone.springdata.spring.data.example.service;

/*
 * @created 21/01/2021 -00:49
 * @project spring-data-example
 * @author  saurabhshcs
 */

import com.techsahrezone.springdata.spring.data.example.entity.Student;
import com.techsahrezone.springdata.spring.data.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StudentService {

    @Autowired
    private StudentRepository  repository;

    public Optional<Student> findStudentForName(final Integer id){

        return repository.findById(id.toString());
    }
}
