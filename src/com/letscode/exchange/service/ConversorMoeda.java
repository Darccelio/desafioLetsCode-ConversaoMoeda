package com.letscode.exchange.service;

import java.math.BigDecimal;

public class ConversorMoeda {

    public static float conveterDolarReais(float moedaDolar, float valorCotacao) {
        return moedaDolar * valorCotacao;
    }
}
