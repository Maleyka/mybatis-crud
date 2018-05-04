package com;

import com.mapper.ClientMapper;
import com.model.Client;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com/mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().addScript("import.sql").build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }

    @Bean
    public ClientMapper clientMapper() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sessionTemplate.getMapper(ClientMapper.class);
    }
}
