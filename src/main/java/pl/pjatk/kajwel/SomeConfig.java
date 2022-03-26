package pl.pjatk.kajwel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "pl.pjatk.test")
public class SomeConfig {

    @Bean
    public POJO somePOJO() {
        return new POJO();
    }

    @Bean
    public List<String> defaultData() {
        return List.of("str1", "str2", "str3", "str4", "str5");
    }

    @Bean
    public DevBean devBean(@Value("${env.dev}") boolean isDev) {
        return isDev ? new DevBean() : null;
    }
}
