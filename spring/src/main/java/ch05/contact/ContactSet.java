package ch05.contact;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactSet {
    private String name;
    private String phoneNumber;

    public ContactSet(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
