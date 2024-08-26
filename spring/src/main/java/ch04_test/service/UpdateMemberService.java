package ch04_test.service;

import ch04_test.dao.MemberDao;
import ch04_test.member.Member;

import java.time.LocalDateTime;

public class UpdateMemberService {
    private MemberDao memberDao;

    public UpdateMemberService(MemberDao memberDao){
        this.memberDao = memberDao;
    };

    public void update(Member member){
        /*if(member.getId() == null || member.getId().isEmpty()){
            throw new NullPointerException("Don't have an id, before update some data");
        }*/
        member.setUpdateTime(LocalDateTime.now());
        member.setCreateTime(memberDao.select(member.getId()).getCreateTime());
        memberDao.update(member);
    }

}
