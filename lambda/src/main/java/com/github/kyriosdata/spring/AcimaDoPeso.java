package com.github.kyriosdata.spring;

import java.util.function.Predicate;

/**
 * Verifica se pessoa é considerada acima do peso, conforme padrão
 * estabelecido na disciplina de Engenharia de Software. Ou seja,
 * nenhuma validade para efeito da "saúde".
 */
public class AcimaDoPeso implements Predicate<Pessoa> {
    public boolean test(Pessoa pessoa) {
        return pessoa.getPeso() > 100;
    }
}
