package ch04_test.service;

import ch04_test.dao.MemberDao;
import ch04_test.member.Member;

import java.util.Map;

public class SelectAllMemberService {
    private MemberDao memberDao;

    public SelectAllMemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public Map<String, Member> selectAll(){
        return memberDao.selectAll();
    }
}
