package com.github.kyriosdata.spring.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Cria instância para a cesso ao MongoDB em localhost:27017 (valores padrão).
 */
@Configuration
@Profile("dev")
public class DevMongoConfiguration {

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient();
    }
}
