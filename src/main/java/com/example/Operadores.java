package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        float nota1 = 3.5f;
        float nota2 = 4.0f;
        float nota3 = 3.7f;
        float promedio = (nota1 + nota2 +nota3)/3f;
    }

    public static void demostrarIncrementoDecremento() {
        int n = 5;
        System.out.println("Usando ++n: " + (++n));
        System.out.println("Usando n++: " + (n++));
    }

    public static void demostrarRelacionales() {
        
    }

    public static void demostrarLogicos() {
        int x = 40;
        if (x > 10 && x < 50) {
            System.out.println("True: Es mayor que 10 y menor que 50");
        }else{
            System.out.println("False: No es mayor que 10 y menor que 50");
        }
    }

    public static void demostrarAsignacionCompuesta() {
        // TODO
    }

    public static void demostrarOperadorTernario() {
        int numero1 = 4;
        String mensaje = (numero1<0) ? "Es negativo" : "Es positivo";
        System.out.println(mensaje);
    }
}