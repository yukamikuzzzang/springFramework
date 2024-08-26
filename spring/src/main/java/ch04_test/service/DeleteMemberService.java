package ch04_test.service;

import ch04_test.dao.MemberDao;

public class DeleteMemberService {
    private final MemberDao memberDao;

    public DeleteMemberService(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    public void delete(String id){
        if(id == null || id.trim().isEmpty()){
            System.out.println("Can't erase 'that' id. \n please input some right id");
        } else {
            memberDao.delete(id);
        }
    }
}
