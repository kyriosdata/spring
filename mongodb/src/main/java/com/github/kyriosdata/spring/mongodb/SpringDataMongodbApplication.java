/*
 * Copyright (c) 2017
 *
 * Fábio Nogueira de Lucena
 * Fábrica de Software - Instituto de Informática (UFG)
 *
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.spring.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringDataMongodbApplication implements CommandLineRunner {

    @Autowired
    private UsuarioRepository repo;

    @RequestMapping("/users")
    private List<Usuario> getUser() {
        return repo.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMongodbApplication.class, args);
    }


    @Override
    public void run(String... args) {
        repo.deleteAll();

        Usuario u1 = new Usuario();
        u1.setId(new BigInteger("1"));
        u1.setNome("João");

        Usuario u2 = new Usuario();
        u2.setId(new BigInteger("2"));
        u2.setNome("Pedro");

        repo.save(u1);
        repo.save(u2);
    }
}
