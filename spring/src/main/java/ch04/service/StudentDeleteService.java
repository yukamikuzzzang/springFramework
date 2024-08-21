package ch04.service;

import ch04.dao.StudentDao;

public class StudentDeleteService {
    private StudentDao studentDao;

    public StudentDeleteService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void delete(String sNum){
        if(verify(sNum)){
            studentDao.delete(sNum);
        } else {
            System.out.println("Student information is available.");
        }
    }

    public boolean verify(String sNum){
        return true;
    }
}
