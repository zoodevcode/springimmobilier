package sn.zoodev.springbootwebservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.zoodev.springbootwebservice.entities.Student;
import sn.zoodev.springbootwebservice.exceptions.StudentNotFoundException;
import sn.zoodev.springbootwebservice.repository.StudentRepository;
import sn.zoodev.springbootwebservice.service.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceStudentImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getOneStudent(Long id) {
        Optional<Student> student = this.studentRepository.findById(id);
        if(!student.isPresent()){
            throw new StudentNotFoundException(String.format("Student with id %s is not found!"+ id));
        }
        return studentRepository.findById(id);
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        Optional<Student> studentExist = this.studentRepository.findById(id);
        if(!studentExist.isPresent()){
            throw new StudentNotFoundException(String.format("Student with id %s is not found!"+ id));
        }
        return studentRepository.save(student);
    }

    @Override
    public void removeStudent(Long id) {
        Optional<Student> student = this.studentRepository.findById(id);
        if(!student.isPresent()){
            throw new StudentNotFoundException(String.format("Student with id %s is not found!"+ id));
        }
        studentRepository.delete(student.get());

    }
}
