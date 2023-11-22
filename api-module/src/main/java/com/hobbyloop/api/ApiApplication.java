package com.hobbyloop.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {
        "com.hobbyloop.facade_service",
        "com.hobbyloop.domain",
        "com.hobbyloop.api",
        "com.hobbyloop.core"
})
@EnableJpaRepositories(basePackages = "com.hobbyloop.domain")
@EntityScan("com.hobbyloop.domain")
public class ApiApplication {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application, application-db"); //타모듈 환경파일 읽기 위함
        SpringApplication.run(ApiApplication.class, args);
    }
}
