package ch04_test.service;

import ch04_test.dao.MemberDao;
import ch04_test.member.Member;

public class SelectMemberService {
    private MemberDao memberDao;

    public SelectMemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    };

    public Member select(String id){
        Member member = memberDao.select(id);
        return member;
    }
}
