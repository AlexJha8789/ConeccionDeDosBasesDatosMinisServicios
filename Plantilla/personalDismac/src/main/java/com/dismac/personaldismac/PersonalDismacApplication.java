package com.dismac.personaldismac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PersonalDismacApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalDismacApplication.class, args);
    }

}
