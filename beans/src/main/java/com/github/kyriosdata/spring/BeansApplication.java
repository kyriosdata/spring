/*
 * Copyright (c) 2017
 *
 * Fábio Nogueira de Lucena
 * Fábrica de Software - Instituto de Informática (UFG)
 *
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@SpringBootApplication
@ImportResource("/configuracao-arquivo.xml")
public class BeansApplication {

	/**
	 * Obtenha o valor dessa propriedade por meio do
	 * bean identificado por "beans". Ou seja, a
	 * configuração é fornecida nessa própria classe.
	 */
	@Autowired
	@Resource(name = "beans")
	private List<String> beans;

	/**
	 * Obtém valor configurado externamente, na
	 * classe SegundoConfiguracao.
	 */
	@Autowired
	@Resource(name = "segundo")
	private String configuracao;

	/**
	 * Obtém valor configurado externamente, na classe
	 * TerceiroConfiguracao. Não é necessário uso de
	 * \@Resource, como no exemplo acima, pois o nome
	 * do campo é também o identificador do bean.
	 */
	@Autowired
	private String terceiro;

	/**
	 * Configurado por meio de documento (arquivo) XML.
	 * Veja configuração em "configuracao-arquivo.xml" e
	 * como esse arquivo foi informado por meio da anotação
	 * \@ImportResource.
	 */
	@Autowired
	private String quarto;

	/**
	 * Define um bean identificado por "beans".
	 * Observe que o valor retornado é mantido em "cache".
	 *
	 * @return Lista de nomes.
	 */
	@Bean
	public List<String> beans() {
		return Arrays.asList("primeiro");
	}

	@RequestMapping("/1")
	public String listaConfiguracaoDeBeans() {
		return String.join(", ", beans);
	}

	@RequestMapping("/2")
	public String arquivoConfiguracao() {
		return configuracao;
	}

	@RequestMapping("/3")
	public String terceiroConfiguracao() {
		return terceiro;
	}

	@RequestMapping("/4")
	public String fromConfigXmlFile() {
		return quarto;
	}

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);
	}
}
