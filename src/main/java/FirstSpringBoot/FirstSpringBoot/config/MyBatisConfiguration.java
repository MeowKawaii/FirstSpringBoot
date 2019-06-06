package FirstSpringBoot.FirstSpringBoot.config;

import FirstSpringBoot.FirstSpringBoot.repository.BookingMapper;
import FirstSpringBoot.FirstSpringBoot.repository.BookingRepository;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class MyBatisConfiguration {

    @Bean(name = "bookingSqlSessionFactory")
    public SqlSessionFactoryBean bookingSessionFactory(@Qualifier("bookingDatasource") DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean;
    }

    @Bean(name = "bookingSqlSessionTemplate")
    public SqlSessionTemplate bookingSqlSessionTemplate(@Qualifier("bookingSqlSessionFactory") SqlSessionFactoryBean factoryBean)
            throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(factoryBean.getObject());
        sqlSessionTemplate.getConfiguration().addMapper(BookingMapper.class);
        return sqlSessionTemplate;
    }

}
