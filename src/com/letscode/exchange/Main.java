package com.letscode.exchange;

import com.letscode.exchange.service.ConversorMoeda;
import com.letscode.exchange.utils.Impressora;
import com.letscode.exchange.utils.Leitor;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here


        float moedaDolar = Leitor.scanearMoeda();
        float cotacaoDolar = Leitor.scanearCotacaoDolar();

        float moedaReais = ConversorMoeda.conveterDolarReais(moedaDolar, cotacaoDolar);

        Impressora.imprimirResultadoConversao(moedaDolar, moedaReais);

    }
}
