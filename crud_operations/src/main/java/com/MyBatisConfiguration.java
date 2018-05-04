package com;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
@MapperScan("org.lanyonm.playground.persistence")
public class MyBatisConfiguration {

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass( class);
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:oracle:thin:sytstem/1q2w3e4r5t@localhost:1521:XE;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");

        // create a table and populate some data
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        System.out.println("Creating tables");
        jdbcTemplate.execute("drop table users if exists");
        jdbcTemplate.execute("create table users(id serial, firstName varchar(255), lastName varchar(255), email varchar(255))");
        jdbcTemplate.update("INSERT INTO users(firstName, lastName, email) values (?,?,?)", "Mike", "Lanyon", "lanyonm@gmail.com");

        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("com.model");
        return sessionFactory;
    }
}