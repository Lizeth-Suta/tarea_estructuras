package org.example;

public class estructuras {
    public static void main(String[] args) {
        // Estructura de control IF
        int edad = 25;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // Estructura de control SWITCH
        String dia = "lunes";
        switch (dia) {
            case "lunes":
                System.out.println("Hoy es lunes");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break;
            default:
                System.out.println("Hoy no es lunes ni martes");
        }

        // Estructura de control FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + i);
        }

        // Estructura de control WHILE
        int j = 0;
        while (j < 5) {
            System.out.println("Iteración " + j);
            j++;
        }

        // Estructura de control DO-WHILE
        int k = 0;
        do {
            System.out.println("Iteración " + k);
            k++;
        } while (k < 5);
    }
}


