package ch04.dao;

import ch04.member.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDao {
    private Map<String, Student> studentDB = new HashMap<String, Student>();

    public Student select(String sNum) {
        return studentDB.get(sNum);
    }

    public void update(Student student) {
        studentDB.put(student.getSNum(), student);
    }

    public void insert(Student student) {
        studentDB.put(student.getSNum(), student);
    }

    public void delete(String sNum) {
        studentDB.remove(sNum);
    }

    public Map<String, Student> getStudentDB() {
        return studentDB;
    }

}
