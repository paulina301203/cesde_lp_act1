package com.example;

import java.util.Scanner;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        int contador = 10;
        while (contador >=1) {
            System.out.println(contador);
            contador--;
        }
    }

    public static void ejemploDoWhile() {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingresa un numero");
            numero = teclado.nextInt();
        } while (numero != 0);

        System.out.println("Fin del programa");
    }

    public static void ejemploForClasico() {
        // TODO
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 10; i++){
            System.out.println("Tabla del " + int);

            for(int j = 1; j <= 10; j++){
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 1; i<= 10; i++){
            if (i==7) {
                System.out.println("se encontro el 7, se termina el bucle");
                break;
            }
            System.out.println("el numero actual es: " + i);
        }
    }

    public static void ejemploEtiquetas() {
        // TODO
    }
}