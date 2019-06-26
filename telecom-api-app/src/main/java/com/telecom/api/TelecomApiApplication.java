package com.telecom.api;

import com.telecom.api.config.BaseConfig;
import com.telecom.api.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaseConfig.class, SwaggerConfig.class})
public class TelecomApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(TelecomApiApplication.class, args);

    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            SystemController systemController = ctx.getBean("systemController", SystemController.class);
//            systemController.testing();
//        };
//    }
}