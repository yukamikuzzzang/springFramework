package ch06.service;

import ch06.member.Student;

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

            System.out.print("sNum: "+student.getSNum()+"\t");
            System.out.print("sId: "+student.getSId()+"\t");
            System.out.print("sPw: "+student.getSPw()+"\t");
            System.out.print("sName: "+student.getSName()+"\t");
            System.out.print("sAge: "+student.getSAge()+"\t");
            System.out.print("sGender: "+student.getSGender()+"\t");
            System.out.print("sMajor: "+student.getSMajor()+"\n");
        }
        System.out.println("END -----------------------");
    }
}
