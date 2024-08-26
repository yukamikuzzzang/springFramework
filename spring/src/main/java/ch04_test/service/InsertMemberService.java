package ch04_test.service;

import ch04_test.dao.MemberDao;
import ch04_test.member.Member;

public class InsertMemberService {
    private MemberDao memberDao;

    public InsertMemberService(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    public void insert(Member member){
        memberDao.insert(member);
    }
}
