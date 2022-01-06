package sn.zoodev.springbootwebservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sn.zoodev.springbootwebservice.entities.Student;
import sn.zoodev.springbootwebservice.serviceImpl.ServiceStudentImpl;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(path = "/api/v1/rest", name = "app_students_")
public class StudentController {
    private ServiceStudentImpl serviceStudentImpl;
    public StudentController(ServiceStudentImpl serviceStudentImpl){
        this.serviceStudentImpl = serviceStudentImpl;
    }

    @PostMapping(path = "/students", name = "create")
    public Student add(@RequestBody Student student){
        return this.serviceStudentImpl.saveStudent(student);
    }
    @GetMapping(path = "/students", name = "list")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> list(){
        return this.serviceStudentImpl.getAllStudents();
    }
    @GetMapping(path = "/students/{id}", name = "read")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Student> read(@PathVariable Long id){
        return this.serviceStudentImpl.getOneStudent(id);
    }
    @PutMapping(path = "/students/{id}", name = "update")
    @ResponseStatus(HttpStatus.OK)
    public Student update(@RequestBody Student student, @PathVariable Long id){
        return this.serviceStudentImpl.updateStudent(student ,id);
    }
    @DeleteMapping(path = "/students/{id}", name = "remove")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id){
        this.serviceStudentImpl.removeStudent(id);
    }
}
