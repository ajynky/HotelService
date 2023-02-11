package com.hotel.service.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

	@Bean
	DataSource getDataSource() {
		return DataSourceBuilder.create().url("jdbc:postgresql://localhost:5432/microservices?sslmode=disable")
				.username("postgres").password("root").driverClassName("org.postgresql.Driver").build();
	}

}