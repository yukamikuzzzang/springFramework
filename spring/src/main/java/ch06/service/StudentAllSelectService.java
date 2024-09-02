package ch06.service;

import ch06.dao.StudentDao;
import ch06.member.Student;

import java.util.Map;

public class StudentAllSelectService {
    private StudentDao studentDao;

    public StudentAllSelectService(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public Map<String, Student> allSelect(){
        return studentDao.getStudentDB();
    }
}
