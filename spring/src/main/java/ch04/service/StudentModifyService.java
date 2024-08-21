package ch04.service;

import ch04.dao.StudentDao;
import ch04.member.Student;

public class StudentModifyService {
    private StudentDao studentDao;

    public StudentModifyService(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public void modify(Student student){
        if(verify(student.getSNum())){
            studentDao.update(student);
        } else {
            System.out.println("Student information is available.");
        }
    }

    public boolean verify(String sNum){
        Student student = studentDao.select(sNum);
        return student != null ? true : false;
    }
}
