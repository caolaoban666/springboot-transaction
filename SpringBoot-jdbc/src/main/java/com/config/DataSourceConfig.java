package com.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author cyf
 * @description
 * @create 2018-09-28 14:47
 **/
@Configuration
public class DataSourceConfig {

    @Bean(name = "aesbDataSource")
    @Qualifier("aesbDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    @Primary
    public DataSource aesbDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "aesbJdbcTemplate")
    public JdbcTemplate aesbJdbcTemplate(@Qualifier("aesbDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "empiDataSource")
    @Qualifier("empiDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource empiDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "empiJdbcTemplate")
    public JdbcTemplate empiJdbcTemplate(@Qualifier("empiDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
