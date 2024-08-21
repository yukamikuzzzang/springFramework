package ch04.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String sNum;
    private String sId;
    private String sPw;
    private String sName;
    private int sAge;
    private char sGender;
    private String sMajor;

    public Student(String sNum, String sId, String sPw, String sName, int sAge, char sGender, String sMajor) {
        this.sNum = sNum;
        this.sId = sId;
        this.sPw = sPw;
        this.sName = sName;
        this.sAge = sAge;
        this.sGender = sGender;
        this.sMajor = sMajor;
    }


}

