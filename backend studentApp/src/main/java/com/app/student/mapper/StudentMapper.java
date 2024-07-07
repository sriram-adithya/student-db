package com.app.student.mapper;

import com.app.student.dto.StudentDto;
import com.app.student.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
    }

    public static Student mapToStudent(StudentDto studentdto){
        return new Student(
                studentdto.getId(),
                studentdto.getFirstName(),
                studentdto.getLastName(),
                studentdto.getEmail()
        );
    }
}
