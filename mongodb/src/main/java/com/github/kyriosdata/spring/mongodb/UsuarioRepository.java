/*
 * Copyright (c) 2016
 *
 * Fábio Nogueira de Lucena
 * Fábrica de Software - Instituto de Informática (UFG)
 *
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.spring.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by kyriosdata on 5/7/17.
 */
public interface UsuarioRepository extends MongoRepository<Usuario, Integer> {
    Usuario findById(int id);
}
