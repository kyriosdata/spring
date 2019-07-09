package com.github.kyriosdata.spring.mongodb;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfiguracao {

    @Value("${database.host}")
    private String mongodbHost;

    @Bean
    public MongoClient mongoClient() {
        System.out.println("--------------");
        System.out.println("MongoDB host: " + mongodbHost);
        System.out.println("--------------");
        return new MongoClient(mongodbHost);
    }
}
