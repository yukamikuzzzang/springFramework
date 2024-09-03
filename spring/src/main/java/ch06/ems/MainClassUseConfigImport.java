package ch06.ems;

import ch06.configuration.MemberConfig1;
import ch06.configuration.MemberConfig2;
import ch06.configuration.MemberConfig3;
import ch06.configuration.MemberConfigImport;
import ch06.member.Student;
import ch06.service.*;
import ch06.utils.InitSampleData;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassUseConfigImport {
    public static void main(String[] args) {
        //IoC 컨테이너에서 생성
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(MemberConfigImport.class);

        //샘플 데이터
        InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
        String[] nums = initSampleData.getNums();
        String[] ids = initSampleData.getIds();
        String[] pws = initSampleData.getPws();
        String[] names = initSampleData.getNames();
        int[] ages = initSampleData.getAges();
        char[] genders = initSampleData.getGenders();
        String[] majors = initSampleData.getMajors();

        //데이터베이스에 샘플 데이터 등록
        StudentRegisterService registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
        for (int i = 0; i < nums.length; i++) {
            registerService.register(new Student(nums[i], ids[i], pws[i], names[i], ages[i], genders[i], majors[i]));
        }

        //학생 리스트
        PrintStudentInformationService printStudentInformationService = ctx.getBean("printStudentInformationService", PrintStudentInformationService.class);
        printStudentInformationService.printStudentInfo();  //학생 리스트

        //학생 등록
        registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
        registerService.register(new Student("hbs006", "deer", "p006", "melissa", 26, 'w', "Music"));

        printStudentInformationService.printStudentInfo();  //학생 리스트

        //학생 출력
        StudentSelectService selectService = ctx.getBean("studentSelectService", StudentSelectService.class);
        Student selectStudent = selectService.select("hbs006");

        System.out.println("STUDENT START ------------------------------------");
        System.out.print("sNum:" + selectStudent.getSNum() + "\t");
        System.out.print("sId:" + selectStudent.getSId() + "\t");
        System.out.print("sPws:" + selectStudent.getSPw() + "\t");
        System.out.print("sName:" + selectStudent.getSName() + "\t");
        System.out.print("sAge:" + selectStudent.getSAge() + "\t");
        System.out.print("sGender:" + selectStudent.getSGender() + "\t");
        System.out.print("sMajor:" + selectStudent.getSMajor() + "\n");
        System.out.println("END ----------------------------------------------");

        //학생 수정
        StudentModifyService modifyService = ctx.getBean("studentModifyService", StudentModifyService.class);
        modifyService.modify(new Student("hbs006", "pig", "p0066", "melisa", 27, 'w', "Computer"));

        printStudentInformationService.printStudentInfo();  //학생 리스트*/

        //학생 삭제
        StudentDeleteService deleteService = ctx.getBean("studentDeleteService", StudentDeleteService.class);
        deleteService.delete("hbs005");

        printStudentInformationService.printStudentInfo(); //학생 리스트

        //시스템 정보
        EMSInformationService emsInformationService = ctx.getBean("eMsInformationService", EMSInformationService.class);
        emsInformationService.printEMSInformation();

        ctx.close();
    }
}
