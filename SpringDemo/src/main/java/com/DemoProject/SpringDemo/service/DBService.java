package com.DemoProject.SpringDemo.service;

import com.DemoProject.SpringDemo.Repository.StudentRepository;
import com.DemoProject.SpringDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(List<Student> students) {
        studentRepository.insert(students);
    }


}
