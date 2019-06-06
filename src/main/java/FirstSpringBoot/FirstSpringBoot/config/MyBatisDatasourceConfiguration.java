package FirstSpringBoot.FirstSpringBoot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@PropertySource("ucenter-profile-response.properties")
@Configuration
public class MyBatisDatasourceConfiguration {

    @Value("${MBANKING.DRIVER}")
    private String driver;
    @Value("${MBANKING.URL}")
    private String url;
    @Value("${MBANKING.USERNAME}")
    private String username;
    @Value("${MBANKING.PASSWORD}")
    private String password;

    @Primary
    @Bean(name = "bookingDatasource")
    public DataSource mercuryDatasource() {
        DriverManagerDataSource dataSourceNew = new DriverManagerDataSource();
        dataSourceNew.setDriverClassName(driver);
        dataSourceNew.setUrl(url);
        dataSourceNew.setUsername(username);
        dataSourceNew.setPassword(password);
        return dataSourceNew;
    }
}
