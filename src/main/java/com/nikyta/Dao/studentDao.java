package com.nikyta.Dao;

import com.nikyta.Entity.Student;

import java.util.Collection;

public interface studentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertSrudentToDB(Student student);
}
