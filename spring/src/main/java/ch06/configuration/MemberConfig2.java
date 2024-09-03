package ch06.configuration;

import ch06.dao.DBConnectionInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig2 {
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
}
