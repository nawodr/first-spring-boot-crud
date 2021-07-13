package com.example.firstspringbootcrud.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student getStudentById(int id){
        return repository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name){
        return repository.findByName(name);
    }

    public String deleteStudent(int id){
        repository.deleteById(id);
        return "product removed ||" + id;
    }

    public Student updateStudent(Student student){
        Student existingStudent=repository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setAge(student.getAge());
        return repository.save(existingStudent);
    }
}
