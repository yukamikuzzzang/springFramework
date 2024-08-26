package ch04_test;

import ch04_test.member.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SampleInitData {
    String[] ids = {"1", "2", "3", "4", "5"};
    String[] pws = {"111", "222", "333", "444", "555"};
    String[] phoneNumbers = {"111-1111-1111", "222-2222-2222", "333-3333-3333", "444-4444-4444", "555-5555-5555"};
    String[] emails = {"111@test.com", "222@test.com", "333@test.com", "444@test.com", "555@test.com"};
}
