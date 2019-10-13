package com.github.kyriosdata.spring;

import java.util.function.Predicate;

public class Idoso implements Predicate<Pessoa> {
    @Override
    public boolean test(Pessoa pessoa) {
        return pessoa.getIdade() >= 60;
    }
}
