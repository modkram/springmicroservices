package com.example.product;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.inject.Named;

/**
 * Created by Modkram on 17.09.2017.
 */
@Configuration
public class ApplicationConfig {

    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig() {
            this.packages("com.example.product.rest");
        }
    }
}
