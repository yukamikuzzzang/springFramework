package ch04.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DBConnectionInfo {
    private String url;
    private String userId;
    private String userPw;
}
