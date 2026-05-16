package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        int dato1 = 5;
        double dato2 = dato1;
    }

    public static void demostrarCastingExplicito() {
        double valor1 = 3.33;
        int valor2 = (int) valor1;
    }

    public static void demostrarProblemasDePrecision() {
        long numerolargo = 2456789123L;
        short numerocorto = (short) numerolargo;

    }
}