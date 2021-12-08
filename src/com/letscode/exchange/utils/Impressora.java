package com.letscode.exchange.utils;

import java.math.BigDecimal;

public class Impressora {

    private final static String MENSAGEM_INSERCAO_VALOR_MONETARIO = "Por favor, insira o valor monetário a ser convertido .....: ";
    private final static String MENSAGEM_INSERVAO_COTACAO_DOLAR = "Qual o valor da cotação do Dolar no dia de hoje ......: ";




    public static void imprimirMensagemEntrada() {
        System.out.print(MENSAGEM_INSERCAO_VALOR_MONETARIO);
    }

    public static void imprimirMensagemCotacaoDolar() {
        System.out.print(MENSAGEM_INSERVAO_COTACAO_DOLAR);
    }

    public static void imprimirResultadoConversao(float valorDolar, float valorReais) {
        System.out.printf("%.2f dolares corresponde a %.2f reais %n", valorDolar, valorReais);
    }

}
