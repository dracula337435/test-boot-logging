package io.dracula.test.boot.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author dk
 */
@EnableScheduling
@SpringBootApplication
public class TestBootLoggingMainApp {

    public static void main(String[] args){
        SpringApplication.run(TestBootLoggingMainApp.class, args);
    }

}
