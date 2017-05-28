package com.github.kyriosdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@SpringBootApplication
public class BeansApplication {

	/**
	 * Obtenha o valor dessa propriedade por meio do
	 * bean identificado por "beans".
	 */
	@Autowired
	@Resource(name = "beans")
	private List<String> beans;

	@Autowired
	@Resource(name = "configuracao")
	private String configuracao;

	/**
	 * Define um bean identificado por "beans".
	 *
	 * @return Lista de nomes.
	 */
	@Bean
	public List<String> beans() {
		return Arrays.asList("primeiro", "segundo", configuracao);
	}

	@RequestMapping("/")
	public String listaConfiguracaoDeBeans() {
		return String.join(", ", beans);
	}

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);
	}
}
