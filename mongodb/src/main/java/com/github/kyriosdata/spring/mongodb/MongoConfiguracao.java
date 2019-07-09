package com.github.kyriosdata.spring.mongodb;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfiguracao {

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("localhost");
    }
}
