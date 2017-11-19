package com.nikyta.Dao;

import com.nikyta.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakestudentDaoImpl implements studentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {

            {
                put(1, new Student(1, "Perviy", "Uborshiki"));
                put(2, new Student(2, "Vtoroy", "Cleaning Managers"));
                put(3, new Student(3, "Tretiy", "Managers of Cleaning MAnagers"));
            }

        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        students.remove(id);
    }

    @Override
    public void updateStudent(Student student){

        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);

    }

    @Override
    public void insertSrudentToDB(Student student) {
        this.students.put(student.getId(),student);
    }
}
