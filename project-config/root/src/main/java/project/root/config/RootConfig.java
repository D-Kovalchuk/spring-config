package project.root.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import project.dao.config.DaoConfig;
import project.web.config.RestConfig;

/**
 * Created by dimon on 18.08.14.
 */
@Configuration
@Import({DaoConfig.class, RestConfig.class})
@PropertySource("classpath:dao-default.properties")
@PropertySource(value = "classpath:dao.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:${user.home}/dao1.properties", ignoreResourceNotFound = true)
public class RootConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocalOverride(true);
        return configurer;
    }

}
