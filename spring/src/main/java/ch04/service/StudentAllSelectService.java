package ch04.service;

import ch04.dao.StudentDao;
import ch04.member.Student;

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
