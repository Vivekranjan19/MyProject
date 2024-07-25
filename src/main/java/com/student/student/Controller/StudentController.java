package com.student.student.Controller;

import com.student.student.Entity.Student;
import com.student.student.Service.StudentServiceImpl;
import com.student.student.exception.IdMissing;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;


@PostMapping("/st")
public ResponseEntity<Student> createRegistration(@RequestBody @Valid Student student){
       Student savedStudent= studentService.createRegistration(student);
       return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
    @GetMapping("student/{id}")
    public ResponseEntity<Student>getstudent(@PathVariable Integer id) throws IdMissing {
    Student s1=studentService.getStudent(id);
    return  new ResponseEntity<>(s1,HttpStatus.OK);
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>>getAll(){
    List<Student> studentList=studentService.getAll();
    return new ResponseEntity<>(studentList,HttpStatus.OK);
    }
    @DeleteMapping("/student/{id}")
    public ResponseEntity<String>delete(@PathVariable Integer id){
    studentService.deleteStudent(id);
    return new ResponseEntity<>("deleted!!",HttpStatus.OK);
    }
}
