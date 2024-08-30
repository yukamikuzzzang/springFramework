package ch05.contact.service;

import ch05.contact.ContactSet;
import ch05.contact.dao.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class ContactSearchService {
    @Resource
    private ContactDao contactDao;
//    public ContactSearchService(){
//        System.out.println("default constructor");
//    }
//    @Autowired
//    public ContactSearchService(ContactDao contactDao) {
//        System.out.println("contactDao = " + contactDao); // contactDao 출력
//        this.contactDao = contactDao;
//    }
    @Autowired
    public ContactSearchService(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public ContactSet searchContact(String name) {
        if (verify(name)) {
            return contactDao.select(name);
        } else {
            System.out.println("Contact information is available.");
        }
        return null;
    }

    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name);
        return contactSet != null ? true : false;
    }

    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }
}
