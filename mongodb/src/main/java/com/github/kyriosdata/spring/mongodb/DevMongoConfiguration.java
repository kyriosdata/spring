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
 * Obtém valores do arquivo <em>application.properties</em>, em particular,
 * <em>mongodb.host</em>, <em>mongodb.port</em> e <em>mongodb.database</em>.
 * Estas propriedades ainda podem ser fornecidas por meio de argumentos ao
 * programa (por exemplo, --mongodb.port=89) e variáveis de ambiente.
 */
@Configuration
@Profile("dev")
public class DevMongoConfiguration {

    @Value("${mongodb.host}")
    private String host;

    @Value("${mongodb.port}")
    private int port;

    @Bean
    public MongoClient mongoClient() {
        MongoClientOptions options = MongoClientOptions.builder().build();
        ServerAddress address = new ServerAddress(host, port);

        return new MongoClient(address, options);
    }
}
