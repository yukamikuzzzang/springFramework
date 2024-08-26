package ch04_test.main;

import ch04_test.SampleInitData;
import ch04_test.dao.MemberDao;
import ch04_test.member.Member;
import ch04_test.service.*;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {


        GenericXmlApplicationContext context
                = new GenericXmlApplicationContext(
                "classpath:ch04/test/applicationContext.xml");

        SampleInitData sampleInitData = context.getBean("sampleInitData", SampleInitData.class);
        String[] ids = sampleInitData.getIds();
        String[] pws = sampleInitData.getPws();
        String[] phoneNumbers = sampleInitData.getPhoneNumbers();
        String[] emails = sampleInitData.getEmails();

        //DB에 샘플 데이터 등록
        InsertMemberService insertMemberService =
                context.getBean("insertMemberService", InsertMemberService.class);

        for (int i = 0; i < ids.length; i++) {
            insertMemberService.insert(new Member(ids[i], pws[i], phoneNumbers[i], emails[i]));
        }
        //멤버 리스트
        PrintMemberInformation printMemberInformation = context.getBean("printMemberInformation", PrintMemberInformation.class);
        printMemberInformation.printMemberInfo();

        //멤버 등록
        insertMemberService = context.getBean("insertMemberService", InsertMemberService.class);
        insertMemberService.insert(new Member("sys","test","010-1111-1111","test@test.com"));

        printMemberInformation.printMemberInfo();

        //멤버 출력
        SelectMemberService selectMemberService = context.getBean("selectMemberService",SelectMemberService.class);
        try {
            Member selectedMember = selectMemberService.select("sys");
            System.out.println("print selected Member");
            System.out.println("selectedMember = " + selectedMember.getId());
            System.out.println("selectedMember = " + selectedMember.getPw());
            System.out.println("selectedMember = " + selectedMember.getPhoneNumber());
            System.out.println("selectedMember = " + selectedMember.getEmail());
            System.out.println("selectedMember = " + selectedMember.getCreateTime());
            System.out.println("selectedMember = " + selectedMember.getUpdateTime());
            System.out.println();
        } catch (NullPointerException npe){
            System.out.println("요청하신 id를 가진 인원이 없습니다.");
        }
        //멤버 수정
        UpdateMemberService updateMemberService = context.getBean("updateMemberService",UpdateMemberService.class);
        updateMemberService.update(new Member("sys","test1","010-2222-2222","test@test.com"));

        printMemberInformation.printMemberInfo();

        //멤버 삭제
        DeleteMemberService deleteMemberService = context.getBean("deleteMemberService",DeleteMemberService.class);
        deleteMemberService.delete("sys");

        printMemberInformation.printMemberInfo();

        context.close();

    }
}

