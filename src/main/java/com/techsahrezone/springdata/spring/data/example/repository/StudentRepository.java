package com.techsahrezone.springdata.spring.data.example.repository;

/*
 * @created 21/01/2021 -00:46
 * @project spring-data-example
 * @author  saurabhshcs
 */

import com.techsahrezone.springdata.spring.data.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class StudentRepository implements JpaRepository<Student, String> {
}
