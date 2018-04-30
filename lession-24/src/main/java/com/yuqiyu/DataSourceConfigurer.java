package com.yuqiyu;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2018/4/18/018.
 */
@Configuration
public class DataSourceConfigurer {

    @Bean(name = "userDataSource")
    @Qualifier(value = "userDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.user")
    public DataSource userDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "bookDataSource")
    @Primary
    @Qualifier(value = "bookDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.book")
    public DataSource bookDataSource() {
        return DataSourceBuilder.create().build();
    }
}
