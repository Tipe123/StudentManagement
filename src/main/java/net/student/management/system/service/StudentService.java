package net.student.management.system.service;

import net.student.management.system.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
