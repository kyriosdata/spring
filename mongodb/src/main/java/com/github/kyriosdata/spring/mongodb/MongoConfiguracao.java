package com.github.kyriosdata.spring.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfiguracao extends AbstractMongoConfiguration {

    @Value("${mongodb.host}")
    private String host;

    @Value("${mongodb.port}")
    private int port;

    @Value("${mongodb.database}")
    private String database;

    @Bean
    public MongoClient mongoClient() {
        System.out.println("--------------");
        System.out.println("MongoDB host: " + host + "/" + port);
        System.out.println("--------------");
        ServerAddress address = new ServerAddress(host, port);
        MongoClientOptions.Builder builder = MongoClientOptions.builder();
        builder.connectTimeout(1000);
        MongoClient mc = new MongoClient(address, builder.build());
        return mc;
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }
}
