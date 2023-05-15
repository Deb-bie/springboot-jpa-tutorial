package com.debbie.springjpatutorial.student.repository;

import com.debbie.springjpatutorial.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
