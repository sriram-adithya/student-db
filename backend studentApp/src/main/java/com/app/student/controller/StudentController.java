package com.app.student.controller;

import com.app.student.dto.StudentDto;
import com.app.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
        StudentDto saveStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<StudentDto> getStudentbyId(@PathVariable("id") String studentid){
        StudentDto studentDto = studentService.getStudentId(studentid);
        return ResponseEntity.ok(studentDto);
    }



    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        List<StudentDto> student = studentService.getAllStudents();
        return ResponseEntity.ok(student);
    }

}
