package ch06.configuration;

import ch06.dao.StudentDao;
import ch06.service.*;
import ch06.utils.InitSampleData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig1 {

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
}
