package ch04.service;

import ch04.member.Student;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintStudentInformationService {
    StudentAllSelectService allSelectService;

    public PrintStudentInformationService(StudentAllSelectService allSelectService){
        this.allSelectService = allSelectService;
    }

    public void printStudentInfo(){
        Map<String, Student> allStudent = allSelectService.allSelect();
        Set<String> keys = allStudent.keySet();
        Iterator<String> iterator = keys.iterator();
        System.out.println("STUDENT LIST START ---------");

        while(iterator.hasNext()){
            String key = iterator.next();








            Student student = allStudent.get(key);
            System.out.println("sNum:"+student.getSNum());
            System.out.println("sId:"+student.getSId());
            System.out.println("sPw:"+student.getSPw());
            System.out.println("sName:"+student.getSName());
            System.out.println("sAge:"+student.getSAge());
            System.out.println("sGender:"+student.getSGender());
            System.out.println("sMajor:"+student.getSMajor());
        }
        System.out.println("END -----------------------");
    }
}
