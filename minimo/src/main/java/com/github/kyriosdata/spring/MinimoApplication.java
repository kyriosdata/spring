package com.github.kyriosdata.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MinimoApplication {

	@RequestMapping("/")
	public String hello() {
		return "Olá, funcionou!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MinimoApplication.class, args);
	}
}
