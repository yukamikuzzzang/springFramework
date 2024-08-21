package ch04.service;

import ch04.dao.DBConnectionInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class EMSInformationService {
    private String info;
    private String copyRight;
    private String version;
    private int SYear;
    private int SMonth;
    private int SDay;
    private int EYear;
    private int EMonth;
    private int EDay;
    private List<String> developers;
    private Map<String, String> administrators;
    private Map<String, DBConnectionInfo> dbInfos;

    public void printEMSInformation() {
        System.out.println("EMS INFORMATION START -----");
        String devPeriod = SYear + "/" + SMonth + "/" + SDay + " ~ " + EYear + "/" + EMonth + "/" + EDay;
        System.out.println(info + "(" + devPeriod + ")");
        System.out.println(version);
        System.out.println("developers = " + developers);
        System.out.println("Administrators = " + administrators);
        printDBInfo();
        System.out.println("END ----------------------");
    }

    private void printDBInfo() {
        Set<String> keys = dbInfos.keySet();
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            DBConnectionInfo info = dbInfos.get(key);
            System.out.print("[" + key + " DB] ");
            System.out.print("url: " + info.getUrl() + "\t");
            System.out.print("userId: " + info.getUserId() + "\t");
            System.out.print("userPw: " + info.getUserPw() + "\n");
        }
    }

}
