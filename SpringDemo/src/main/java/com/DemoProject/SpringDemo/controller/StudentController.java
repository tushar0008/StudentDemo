package com.DemoProject.SpringDemo.controller;


import com.DemoProject.SpringDemo.model.Temp;
import com.DemoProject.SpringDemo.service.DBService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class StudentController {

    @Autowired
    private DBService dbService;

    @Autowired
    private ObjectMapper mapper;

    @RequestMapping(path = "/saveStudents", method = RequestMethod.POST)
    public void saveStudents(@RequestBody String jsonString) throws JsonProcessingException {
        try {
            Temp wrapper = mapper.readValue(jsonString, Temp.class);
            dbService.saveStudent(wrapper.getStudents());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
