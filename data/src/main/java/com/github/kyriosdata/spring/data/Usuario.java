/*
 * Copyright (c) 2017
 *
 * Fábio Nogueira de Lucena
 * Fábrica de Software - Instituto de Informática (UFG)
 *
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.spring.data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Classe Usuario.
 */
@Entity
public class Usuario {

    @Id
    private int id;

    private String nome;

    private String empresa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
