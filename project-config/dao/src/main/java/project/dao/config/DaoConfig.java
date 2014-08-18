package project.dao.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import project.dao.Model;

import static project.dao.config.PropertyNames.JDBC_URL;

/**
 * Created by dimon on 18.08.14.
 */
@Configuration
@PropertySource("classpath:dao-default.properties")
public class DaoConfig {

    @Value(JDBC_URL)
    private String url;

    @Bean
    public Model model() {
        return new Model(url);
    }

}
