package ch04_test.member;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Member {
    String id;
    String pw;
    String phoneNumber;
    String email;
    LocalDateTime createTime;
    LocalDateTime updateTime;

    public Member(String id, String pw, String phoneNumber, String email){
        if(id == null || id.trim().isEmpty()){ throw new NullPointerException("Didn't have an id"); }
        if(pw == null || pw.trim().isEmpty()){ throw new NullPointerException("Didn't have a pw"); }
        if(phoneNumber == null || phoneNumber.trim().isEmpty()){ throw new NullPointerException("Didn't have a phone number"); }
        if(email == null || email.trim().isEmpty()){ throw new NullPointerException("Didn't have an email"); }

        this.id = id;
        this.pw = pw;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createTime = LocalDateTime.now();
        this.updateTime = LocalDateTime.now();
    }
}
