package ch04.service;

import ch04.dao.StudentDao;
import ch04.member.Student;

public class StudentRegisterService {
    private StudentDao studentDao;

    public StudentRegisterService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void register(Student student) {
        if (verify(student.getSNum())) {
            studentDao.insert(student);
        } else{
            System.out.println("The student has already registered.");
        }
    }

    public boolean verify(String sNum) {
        Student student = studentDao.select(sNum);
        return student == null ? true : false;
    }
}
