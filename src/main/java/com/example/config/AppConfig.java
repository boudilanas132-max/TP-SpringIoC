package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.example.dao", "com.example.metier"})
//@Import(DaoAliasConfig.class)
@Import(DynamicDaoConfig.class)
public class AppConfig {
    // Configuration vide pour l'instant
}