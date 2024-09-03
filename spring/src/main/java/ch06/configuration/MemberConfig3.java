package ch06.configuration;

import ch06.dao.DBConnectionInfo;
import ch06.service.EMSInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class MemberConfig3 {

    @Autowired
    DBConnectionInfo dev_DBConnectionInfoDev;

    @Autowired
    DBConnectionInfo real_DBConnectionInfoDev;


    @Bean
    public EMSInformationService eMsInformationService(){
        EMSInformationService emsInformationService = new EMSInformationService();
        emsInformationService.setInfo("Education Management System program was developed by 2022.");
        emsInformationService.setCopyRight("COPYRIGHT(C) 2022 EMS CO., LTD.");
        emsInformationService.setVersion("The version is 1.0");
        emsInformationService.setSYear(2022);
        emsInformationService.setSMonth(3);
        emsInformationService.setSDay(1);
        emsInformationService.setEYear(2022);
        emsInformationService.setEMonth(4);
        emsInformationService.setEDay(30);

        List<String> developers = new ArrayList<String>();
        developers.add("Cheney.");
        developers.add("Eloy.");
        developers.add("Jasper.");
        developers.add("Dillon.");
        developers.add("Kian.");
        emsInformationService.setDevelopers(developers);

        Map<String,String> administrators = new HashMap<String,String>();
        administrators.put("Cheney","cheney@springPjt.org");
        emsInformationService.setAdministrators(administrators);

        Map<String, DBConnectionInfo> dbInfos = new HashMap<>();
        dbInfos.put("dev",dev_DBConnectionInfoDev);
        dbInfos.put("real",real_DBConnectionInfoDev);
        emsInformationService.setDbInfos(dbInfos);

        return emsInformationService;
    }
}
