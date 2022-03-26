package pl.pjatk.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScanMe {

    @Bean
    public String test() {
        System.out.println("ScanMe was scanned");
        return null;
    }
}
