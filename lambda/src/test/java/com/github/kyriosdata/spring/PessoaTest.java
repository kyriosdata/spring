package com.github.kyriosdata.spring;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PessoaTest {

	@Test
	void pessoaComNomeRaro() {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Davi");

		assertTrue(new NomeRaro().test(pessoa));
	}

	@Test
	void pessoaIdosaComNomeRaro() {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(61);
		pessoa.setNome("Maria");

		assertTrue(new NomeRaro().and(new Idoso()).test(pessoa));

		Predicate<Pessoa> nomeRaro = new NomeRaro();
		Predicate<Pessoa> idosa = new Idoso();
		Predicate<Pessoa> idosaComNomeRaro = idosa.and(nomeRaro);
		assertTrue(idosaComNomeRaro.test(pessoa));
	}

}
