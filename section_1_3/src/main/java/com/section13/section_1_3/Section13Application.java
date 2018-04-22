package com.section13.section_1_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.reactor.core.ReactorCoreAutoConfiguration;

@SpringBootApplication(exclude = {ReactorCoreAutoConfiguration.class})
public class Section13Application {

    public static void main(String[] args) {
        SpringApplication.run(Section13Application.class, args);
    }
}
