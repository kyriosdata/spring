package com.github.kyriosdata.spring.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class SpringDataMongodbApplication {

	@Autowired
	private UsuarioRepository repo;

	@RequestMapping("/users")
    private Usuario getUser() {
	    Usuario usr = new Usuario();
	    usr.setId(new Random().nextInt(100_000));
	    usr.setNome("fábio");

	    repo.save(usr);

	    return repo.findById(usr.getId());
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongodbApplication.class, args);
	}
}
