package com.example.bot2.datasources;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSource {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql:db");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("root");
        return (DataSource) dataSourceBuilder.build();
    }
}
