package com.app.student.service;

import com.app.student.dto.StudentDto;
import com.app.student.entity.Student;
import com.app.student.exception.ResourceNoFound;
import com.app.student.mapper.StudentMapper;
import com.app.student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    private StudentRepo studentRepo;

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        Student saveStudent = studentRepo.save(student);
        return StudentMapper.mapToStudentDto(saveStudent);
    }

    @Override
    public StudentDto getStudentId(String studentId) {
        Student student = studentRepo.findById(studentId)
                .orElseThrow(() -> new ResourceNoFound("No Student exist"));
        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepo.findAll();
        return students.stream().map((student -> StudentMapper.mapToStudentDto(student))).collect(Collectors.toList());
    }
}
