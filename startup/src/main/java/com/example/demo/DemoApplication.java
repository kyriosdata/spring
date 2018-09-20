package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println();
        System.out.println("Contains options for 'teste'?: " + args.containsOption(
                "teste"));

        System.out.println("optionValues: " + args.getOptionValues("teste"));
        System.out.println("optionNames: " + args.getOptionNames());
        System.out.println("NonOptionArgs: " + args.getNonOptionArgs());
        System.out.println("Original: " + Arrays.asList(args.getSourceArgs()));
        System.out.println();
    }
}