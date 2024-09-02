package ch06.service;

import ch06.dao.StudentDao;
import ch06.member.Student;

public class StudentModifyService {
    private StudentDao studentDao;

    public StudentModifyService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void modify(Student student) {
        this.studentDao.update(student);
    }
}
