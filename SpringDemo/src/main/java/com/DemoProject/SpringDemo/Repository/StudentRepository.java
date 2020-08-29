package com.DemoProject.SpringDemo.Repository;

import com.DemoProject.SpringDemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}


