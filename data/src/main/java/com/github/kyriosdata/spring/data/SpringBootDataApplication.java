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

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
public class SpringBootDataApplication {

	@Autowired
	UsuarioRepository repo;

    /**
     * Requisita armazenamento de uma instância criada a cada requisição.
     * Chave gerada arbitrariamente.
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

	/**
	 * Exibe a lista de identificadores de usuários disponíveis no banco.
	 *
	 * @return Serialização (String) dos usuários disponíveis.
	 */
	@RequestMapping("/ids")
	public String showIds() {
		StringBuilder sb = new StringBuilder();
		List<Integer> ids = repo.findAll().stream().map(u -> u.getId()).collect(Collectors.toList());
		ids.forEach(i -> sb.append(i + "\n"));
		return sb.toString();
	}

	/**
	 * Exibe a lista de usuários.
	 *
	 * @return Serialização (String) dos usuários disponíveis.
	 */
	@RequestMapping("/show")
	public String showAll() {
		StringBuilder sb = new StringBuilder();
		repo.findAll().forEach(u -> sb.append(u + "\n"));
		return sb.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}
}
