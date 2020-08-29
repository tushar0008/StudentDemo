package com.DemoProject.SpringDemo.model;

import java.util.List;

public class Temp {

    List<Student> students;
    List<Student> itStudents;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getItStudents() {
        return itStudents;
    }

    public void setItStudents(List<Student> itStudents) {
        this.itStudents = itStudents;
    }

//    @Override
//    public String toString() {
//        return "Temp{" +
//                "students=" + students +
//                ", itStudents=" + itStudents +
//                '}';
//    }
}
