package ch05.contact.service;

import ch05.contact.ContactSet;
import ch05.contact.dao.ContactDao;

public class ContactSearchService {
    private ContactDao contactDao;

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
