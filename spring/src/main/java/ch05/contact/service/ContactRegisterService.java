package ch05.contact.service;

import ch05.contact.ContactSet;
import ch05.contact.dao.ContactDao;
import javax.inject.Inject;
import javax.inject.Named;


public class ContactRegisterService {
    @Inject
    @Named("contactDao1")
    private ContactDao contactDao;

    public ContactRegisterService(ContactDao contactDao){
        this.contactDao = contactDao;
    }

    public void setContactDao(ContactDao contactDao){
        this.contactDao = contactDao;
    }

    public void register(ContactSet contactSet) {
        String name = contactSet.getName();
        if (verify(name)) {
            contactDao.insert(contactSet);
        } else {
            System.out.println("The name has already registered.");
        }
    }

    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name);
        return contactSet == null ? true : false;
    }

    public void setWordDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }
}
