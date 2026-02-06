package io.github.ftcphantom16950.backendsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/// start
@SpringBootApplication
@RestController
public class BackendSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendSiteApplication.class, args);
    }

}
