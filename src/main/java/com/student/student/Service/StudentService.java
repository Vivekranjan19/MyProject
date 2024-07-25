package com.student.student.Service;

import com.student.student.Entity.Student;
import com.student.student.exception.IdMissing;

import java.util.List;

public interface StudentService {
    public Student createRegistration(Student student);
    public Student getStudent(Integer id) throws IdMissing;
    public List<Student>getAll();
    public String deleteStudent(Integer id);
}
