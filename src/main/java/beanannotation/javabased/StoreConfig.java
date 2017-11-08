package beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@ImportResource("classpath:spring/config.xml")
public class StoreConfig {

    @Bean(name = "store", destroyMethod = "destroy")
    public Store stringStore() {
        return new StringStore();
    }

    @Value("${url}")
    private String url;

    @Value("${username}")
    private String name;

    @Value("${password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager() {
        return new MyDriverManager(url, password, name);
    }
}
