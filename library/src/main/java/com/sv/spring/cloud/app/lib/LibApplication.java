package com.sv.spring.cloud.app.lib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RestController;

@Description("just for test.")
@SpringBootApplication(scanBasePackages = "com.sv.spring.cloud")
@RestController
public class LibApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibApplication.class, args);
    }
}
