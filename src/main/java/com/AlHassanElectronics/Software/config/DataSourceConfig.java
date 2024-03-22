//package com.AlHassanElectronics.Software.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
//
//import javax.sql.DataSource;
//
//import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;
//
//public class DataSourceConfig {
//    @Bean
//    DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .setType(H2)
//                .addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
//                .build();
//    }
//}
