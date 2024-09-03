package ch06.configuration;

import ch06.dao.DBConnectionInfo;
import ch06.dao.StudentDao;
import ch06.service.*;
import ch06.utils.InitSampleData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class MemberConfig {
    @Bean
    public InitSampleData initSampleData(){
        InitSampleData initSampleData = new InitSampleData();

        String[] nums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"};
        String[] ids = {"rabbit", "hippo", "raccoon", "elephant", "lion"};
        String[] pws = {"96539", "64875", "15284", "48765", "28661"};
        String[] names ={"agatha", "barbara", "chris", "doris", "elva"};
        int[] ages = {19, 22, 20, 27, 19};
        char[] genders = {'M', 'W', 'W', 'M', 'M'};
        String[] majors = {"English Literature", "Korean Language and Literature", "French Language And Literature", "Philosophy", "History"};

        initSampleData.setNums(nums);
        initSampleData.setIds(ids);
        initSampleData.setPws(pws);
        initSampleData.setNames(names);
        initSampleData.setAges(ages);
        initSampleData.setGenders(genders);
        initSampleData.setMajors(majors);

        return initSampleData;
    }

    @Bean
    public StudentDao studentDao() {
        return new StudentDao();
    }

    @Bean
    public StudentRegisterService studentRegisterService() {
        return new StudentRegisterService(studentDao());
    }

    @Bean
    public StudentModifyService studentModifyService(){
        return new StudentModifyService(studentDao());
    }

    @Bean
    public StudentDeleteService studentDeleteService(){
        return new StudentDeleteService(studentDao());
    }

    @Bean
    public StudentSelectService studentSelectService(){
        return new StudentSelectService(studentDao());
    }

    @Bean
    public StudentAllSelectService studentAllSelectService() {
        return new StudentAllSelectService(studentDao());
    }

    @Bean
    public PrintStudentInformationService printStudentInformationService(){
        return new PrintStudentInformationService(studentAllSelectService());
    }

    @Bean
    public DBConnectionInfo dev_DBConnectionInfoDev() {
        DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
        dbConnectionInfo.setUrl("000.000.000.000");
        dbConnectionInfo.setUserId("admin");
        dbConnectionInfo.setUserPw("0000");

        return dbConnectionInfo;
    }

    @Bean
    public DBConnectionInfo real_DBConnectionInfoDev() {
        DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
        dbConnectionInfo.setUrl("111.111.111.111");
        dbConnectionInfo.setUserId("master");
        dbConnectionInfo.setUserPw("1111");

        return dbConnectionInfo;
    }

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

        Map<String,DBConnectionInfo> dbInfos = new HashMap<>();
        dbInfos.put("dev",dev_DBConnectionInfoDev());
        dbInfos.put("real",real_DBConnectionInfoDev());
        emsInformationService.setDbInfos(dbInfos);

        return emsInformationService;
    }
}
