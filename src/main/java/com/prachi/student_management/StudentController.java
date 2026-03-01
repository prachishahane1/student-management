package com.prachi.student_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // POST - Create new student
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return repo.save(student);
    }

    // GET - Get all students
    @GetMapping
    public List<Student> getAll(){
        return repo.findAll();
    }

    // GET - Get student by ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id){
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    // PUT - Update student
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student studentDetails){
        Student student = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));

        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setCourse(studentDetails.getCourse());

        return repo.save(student);
    }

    // DELETE - Delete student
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        Student student = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));

        repo.delete(student);
        return "Student deleted successfully with id " + id;
    }
}