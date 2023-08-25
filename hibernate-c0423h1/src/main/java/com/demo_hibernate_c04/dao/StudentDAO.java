package com.demo_hibernate_c04.dao;

import com.demo_hibernate_c04.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class StudentDAO {
    SessionFactory sessionFactory;

    public StudentDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Student> getAll() {
        Session session = sessionFactory.openSession();
        List<Student> students = session.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        return students;
    }
    public List<Student> getAllByIdClass(int idClass) {
        Session session = sessionFactory.openSession();
        List<Student> students = session.createQuery("SELECT s FROM Student s where s.classRoom.id = :idClass", Student.class).setParameter("idClass",idClass).getResultList();
        return students;
    }

    public void addStudent(Student student){
        Session session = sessionFactory.openSession();
        session.save(student);
    }

    public void editStudent(Student student){
        Session session = sessionFactory.openSession();
        session.merge(student);
    }

    public Student findById(int id){
        Session session = sessionFactory.openSession();
        return session.find(Student.class,id);
    }


}

