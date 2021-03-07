package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * matches to all properties starting with 'guru'
 */
@ConfigurationProperties("guru")
@Configuration
public class SfgConfiguration {


//    @Value("${guru.username}")
    private String username;
//    @Value("${guru.password}")
    private String password;
//    @Value("${guru.jdbcurl}")
    private String jdbcurl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }

    public void setJdbcurl(String jdbcurl) {
        this.jdbcurl = jdbcurl;
    }
}
