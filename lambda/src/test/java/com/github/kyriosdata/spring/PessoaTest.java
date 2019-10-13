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

	@Test
	void lambdaExemplo() {
		Predicate<Pessoa> jovem = p -> p.getIdade() < 18;
		Predicate<Pessoa> noPeso = p -> p.getPeso() < 90;
		Predicate<Pessoa> nomeBonito = p -> p.getNome().equals("Davi");

		// Interessante é a pessoa jovem com menos de 90 quilos e nome bonito,
		// ou, se estas condições não forem satisfeitas,
		// se for pessoa "alta", mais de 1.9 de altura.
		Predicate<Pessoa> interessante = jovem
				.and(nomeBonito.and(noPeso))
				.or(p -> p.getAltura() > 1.9);

		Pessoa davi = new Pessoa();
		davi.setNome("Davi");
		davi.setIdade(17);
		davi.setPeso(89);

		assertTrue(interessante.test(davi));

		// Reutilizando mesma instância
		// Pessoa não é um "value object", não é immutable.
		davi.setIdade(20);
		davi.setAltura(2);
		assertTrue(interessante.test(davi));
	}
}
