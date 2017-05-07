/*
 * Copyright (c) 2017
 *
 * Fábio Nogueira de Lucena
 * Fábrica de Software - Instituto de Informática (UFG)
 *
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.spring.data;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface para a classe Usuario. Deve ser definida
 * uma para cada uma das entidades criadas.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
