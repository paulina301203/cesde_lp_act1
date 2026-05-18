package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        int edad = 16;
        if (edad < 18) {
            System.out.println("No es apto para votar");
        }
    }

    public static void ejemploIfElse() {
        int edad = 16;
        if (edad < 18) {
            System.out.println("No es apto para votar");
        }else{
            System.out.println("Es apto para votar");
        }
    }

    public static void ejemploIfElseIfElse() {
        // TODO
    }

    public static void ejemploSwitch() {
        int dia = 3;
        String nombreDia;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;   
            
            case 4:
                System.out.println("Jueves");
                break;  
                
            case 5:
                System.out.println("viernes");
                break;   
                
            case 6:
                System.out.println("Sabado");
                break; 
                
            case 7:
                System.out.println("Domingo");
                break;     
        
            default:
                System.out.println("Novalido");
                break;
        }
    }

    public static void ejemploSwitchExpression() {
       String estacion = "Verano";
       String clima = switch (estacion) {
        case "Verano"    -> "Hace mucho calor y sol";
        case "Invierno"  -> "Hace mucho frío y llueve";
        case "Primavera" -> "Las flores florecen y el clima es templado";
        case "Otoño"     -> "Las hojas caen y hace viento";
        default          -> "Estación desconocida"; 
         };
         System.out.println("En " + estacion + ": " + clima);
    }
}