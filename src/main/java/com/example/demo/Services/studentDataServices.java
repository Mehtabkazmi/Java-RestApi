package com.example.demo.Services;

import com.example.demo.model.student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class studentDataServices {
    
    List<student> stList;
    public List<student> getStudentList(){
              stList= new ArrayList<>();
              stList.add(new student("1","awais"));
              stList.add(new student("2","mehtab"));
              stList.add(new student("3","kazmi"));
              stList.add(new student("4","Al"));
              stList.add(new student("5","mashhadi"));
              return stList;
            }
}
