package ch04_test.service;

import ch04_test.member.Member;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintMemberInformation {
    SelectAllMemberService selectAllMemberService;

    public PrintMemberInformation(SelectAllMemberService selectAllMemberService) {
        this.selectAllMemberService = selectAllMemberService;
    }

    public void printMemberInfo() {
        Map<String, Member> allMember = selectAllMemberService.selectAll();
        Set<String> keys = allMember.keySet();

        System.out.println("=== member of 'HANBIT STRICT' ===");
        for (String key : keys) {
            Member member = allMember.get(key);
            System.out.println("member.getId() = " + member.getId() + "\t");
            System.out.println("member.getPw() = " + member.getPw() + "\t");
            System.out.println("member.getPhoneNumber() = " + member.getPhoneNumber() + "\t");
            System.out.println("member.getEmail() = " + member.getEmail() + "\t");
            System.out.println("member.getUpdateTime() = " + member.getUpdateTime() + "\t");
            System.out.println("member.getCreateTime() = " + member.getCreateTime() + "\n");
        }
        System.out.println("--- END --- \n");

    }
}
