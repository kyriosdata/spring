/*
 * Copyright (c) 2017
 *
 * Fábio Nogueira de Lucena
 * Fábrica de Software - Instituto de Informática (UFG)
 *
 * Creative Commons Attribution 4.0 International License.
 */

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

    /**
     * Requisita armazenamento de uma instância criada a cada requisição.
     * Chave gerada via Random class.
     *
     * @return <code>true</code> para indicar que operação foi
	 * executada de forma satisfatória, ou <code>false</code>,
	 * caso contrário.
     */
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
