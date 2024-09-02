package ch05.contact.service;

import ch05.contact.ContactSet;
import ch05.contact.dao.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class ContactSearchService {
    /*@Autowired
    @Qualifier("usedDao")*/
    @Autowired(required = false)
    private ContactDao contactDao;

//    @Autowired
//    public ContactSearchService(ContactDao contactDao) {
//        System.out.println("contactDao = " + contactDao); // contactDao 출력
//        this.contactDao = contactDao;
//    }
    public void setContactDao(ContactDao contactDao) {
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


}
