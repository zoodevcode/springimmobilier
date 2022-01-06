package sn.zoodev.springbootwebservice.service;

import sn.zoodev.springbootwebservice.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> getOneStudent(Long id);
    public Student updateStudent(Student student, Long id);
    public void removeStudent(Long id);
}

