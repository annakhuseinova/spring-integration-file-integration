package com.annakhuseinova.springintegrationfileintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("integration-context.xml")
@SpringBootApplication
public class SpringIntegrationFileIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationFileIntegrationApplication.class, args);
    }

}
