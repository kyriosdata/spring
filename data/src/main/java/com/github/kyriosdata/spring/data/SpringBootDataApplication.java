package com.github.kyriosdata.spring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class SpringBootDataApplication {

	@Autowired
	UsuarioRepository repo;

	@RequestMapping("/create")
	public String create() {
        Usuario usr = new Usuario();
        usr.setEmpresa("UFG");
        usr.setId(new Random().nextInt(1000));
        usr.setNome("Fábio");
        Usuario retorno = repo.save(usr);
        return Boolean.toString(retorno != null);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}
}
