package project.root.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by dimon on 18.08.14.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("jdbc.url");
        System.out.println(property);
    }

}
