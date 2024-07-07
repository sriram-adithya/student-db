package com.app.student.service;

import com.app.student.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto getStudentId(String studentId);

    List<StudentDto> getAllStudents();
}
