package ch05.contact;

import ch05.contact.service.ContactRegisterService;
import ch05.contact.service.ContactSearchService;
import ch05.contact.utils.InitSampleData;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        //IoC 컨테이너 생성
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:ch05/appCtx.xml");

        //샘플 데이터
        InitSampleData initSampleData = context.getBean("initSampleData", InitSampleData.class);
        String[] names = initSampleData.getNames();
        String[] phoneNumbers = initSampleData.getPhoneNumbers();

        //데이터 등록
        ContactRegisterService registerService = context.getBean("registerService",ContactRegisterService.class);
        for(int i = 0; i < names.length; i++){
            ContactSet contactSet = new ContactSet(names[i], phoneNumbers[i]);
            registerService.register(contactSet);
        }

        //데이터 조회
        ContactSearchService searchService = context.getBean("searchService", ContactSearchService.class);
        ContactSet contactSet = searchService.searchContact("류현진");
        System.out.println("name: " + contactSet.getName());
        System.out.println("phoneNumbers = " + contactSet.getPhoneNumber());
        System.out.println("-----------");

        contactSet = searchService.searchContact("손흥민");
        System.out.println("name: " + contactSet.getName());
        System.out.println("phoneNumbers = " + contactSet.getPhoneNumber());
        System.out.println("-----------");

        contactSet = searchService.searchContact("김연경");
        System.out.println("name: " + contactSet.getName());
        System.out.println("phoneNumbers = " + contactSet.getPhoneNumber());

        context.close();
    }
}
