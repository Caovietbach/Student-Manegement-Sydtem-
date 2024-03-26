package org.example.studentmanagement.repository;

import org.example.studentmanagement.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    boolean existsByEmail(String email);
}
