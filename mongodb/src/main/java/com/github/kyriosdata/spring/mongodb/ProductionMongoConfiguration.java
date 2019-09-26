package com.github.kyriosdata.spring.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

/**
 * Obtém valores do arquivo <em>application.properties</em>, em particular,
 * <em>mongodb.host</em>, <em>mongodb.port</em> e <em>mongodb.database</em>.
 * Estas propriedades ainda podem ser fornecidas por meio de argumentos ao
 * programa (por exemplo, --mongodb.port=89) e variáveis de ambiente.
 */
@Configuration
@Profile("production")
public class ProductionMongoConfiguration {

    @Value("${mongodb.host}")
    private String host;

    @Value("${mongodb.port}")
    private int port;

    @Value("${mongodb.database}")
    private String database;

    @Value("${mongodb.username}")
    private String username;

    @Value("${mongodb.password}")
    private char[] password;

    @Bean
    public MongoClient mongoClient() {
        MongoCredential credential = MongoCredential.createCredential(username,
                database, password);

        MongoClientOptions options = MongoClientOptions.builder().build();

        ServerAddress address = new ServerAddress(host, port);
        return new MongoClient(address, Arrays.asList(credential), options);
    }
}
