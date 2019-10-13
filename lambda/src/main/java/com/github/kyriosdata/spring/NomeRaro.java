package com.github.kyriosdata.spring;

import java.util.function.Predicate;

public class NomeRaro implements Predicate<Pessoa> {

    @Override
    public boolean test(Pessoa pessoa) {
        return pessoa.getNome().length() < 6;
    }
}
