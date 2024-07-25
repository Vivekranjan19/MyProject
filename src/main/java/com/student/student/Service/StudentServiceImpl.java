package com.student.student.Service;

import com.student.student.Entity.Student;
import com.student.student.Repository.StudentRepository;
import com.student.student.exception.IdMissing;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Lazy
    @Autowired
    private  StudentRepository studentRepository;

    @Override
    public Student createRegistration(Student student) {
        Student student1=studentRepository.save(student);
        return student;
    }

    @Override
    public Student getStudent(Integer id) throws IdMissing {
        Optional<Student>  student =studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }else {
            throw new IdMissing("id not found");
        }

    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public String deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return "deleted!!";
    }
}
