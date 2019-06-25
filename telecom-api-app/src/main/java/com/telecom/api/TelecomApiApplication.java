package com.telecom.api;

import com.telecom.api.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ SwaggerConfig.class})
public class TelecomApiApplication {
    public static void main(String[] args) {

        System.out.println("starting Project");
        SpringApplication.run(TelecomApiApplication.class, args);
        System.out.println("Ending Project");
    }
}
