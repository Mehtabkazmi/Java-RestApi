package com.example.demo.restController;

import com.example.demo.Services.studentDataServices;
import com.example.demo.model.student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentApi {

    @Autowired
    studentDataServices studentDataServices;
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public String stundetList(){
        return "All students of UMT";
    }
    
    @RequestMapping(value = "/allStudents",method = RequestMethod.GET)
    public List<student> allStundetList(){
        
        return studentDataServices.getStudentList();
    }
}
