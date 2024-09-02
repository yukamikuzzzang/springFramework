package ch06.service;

import ch06.dao.StudentDao;
import ch06.member.Student;

public class StudentSelectService {
    private StudentDao studentDao;

    public StudentSelectService(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public Student select(String sNum){
        if(verify(sNum)){
            return studentDao.select(sNum);
        } else {
            System.out.println("Student information is available.");
        }
        return null;
    }

    public boolean verify (String sNum){
        Student student = studentDao.select(sNum);
        return student != null ? true : false;
    }

}
