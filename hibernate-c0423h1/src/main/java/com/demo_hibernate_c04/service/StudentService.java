package com.demo_hibernate_c04.service;

import com.demo_hibernate_c04.dao.StudentDAO;
import com.demo_hibernate_c04.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentDAO studentDAO;


    public List<Student> getAll() {
       return studentDAO.getAll();
    }

    public void addStudent(Student student){
        studentDAO.addStudent(student);
    }

    public void editStudent(Student student){
        studentDAO.editStudent(student);
    }

    public Student findById(int id){
      return studentDAO.findById(id);
    }

}
