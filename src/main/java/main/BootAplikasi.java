package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Danang
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BootAplikasi {
    public static void main(String[] args) throws Exception {
       SpringApplication.run(BootAplikasi.class, args);
    }
}
