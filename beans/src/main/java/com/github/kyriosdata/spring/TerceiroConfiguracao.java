/*
 * Copyright (c) 2017
 *
 * Fábio Nogueira de Lucena
 * Fábrica de Software - Instituto de Informática (UFG)
 *
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Define bean identificado por "terceiro".
 */
@Configuration
public class TerceiroConfiguracao {

    @Bean
    public String terceiro() {
        return "terceiro";
    }
}
