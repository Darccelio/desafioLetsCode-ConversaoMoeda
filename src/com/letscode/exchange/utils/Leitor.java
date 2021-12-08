package com.letscode.exchange.utils;

import java.math.BigDecimal;

import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static float scanearMoeda() {
        Impressora.imprimirMensagemEntrada();
        return sc.nextFloat();
    }

    public static float scanearCotacaoDolar() {
        Impressora.imprimirMensagemCotacaoDolar();
        return sc.nextFloat();
    }





}
