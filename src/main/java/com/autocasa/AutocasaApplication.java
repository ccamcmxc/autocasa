package com.autocasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutocasaApplication {

    public static void main(String[] args) {
        System.setProperty("server.port", webPort);
        SpringApplication.run(AutocasaApplication.class, args);
    }
}
