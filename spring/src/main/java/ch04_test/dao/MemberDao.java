package ch04_test.dao;

import ch04_test.member.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
    HashMap<String, Member> memberDao = new HashMap<String, Member>();

    public Member select(String id) {
        return memberDao.get(id);
    }

    public void update(Member member) {
        memberDao.put(member.getId(), member);
    }

    public void insert(Member member) {
        memberDao.put(member.getId(), member);
    }

    public void delete(String id){
        memberDao.remove(id);
    }

    public Map<String,Member> selectAll(){
        return memberDao;
    }
}
