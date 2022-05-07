package pl.pjatk.kajwel.some.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.pjatk.kajwel.dev.bean.DevBean;
import pl.pjatk.kajwel.some.model.SomePOJO;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "pl.pjatk.test")
public class SomeConfig {

    @Bean
    public SomePOJO somePOJO() {
        return new SomePOJO();
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
