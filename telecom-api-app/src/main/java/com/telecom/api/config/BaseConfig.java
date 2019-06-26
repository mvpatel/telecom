package com.telecom.api.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Base configuration for the System, handles configuration of SpringBoot  .
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.telecom.*"})
@EntityScan(basePackages = {"com.telecom.model.data"})
public class BaseConfig {
    
}