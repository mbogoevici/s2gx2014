package org.springframework.integration.samples.cafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ImportResource({"classpath:META-INF/spring/integration/cafe-*.xml"})
public class CafeDrinksBoot {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CafeDrinksBoot.class, args);
    }

}

