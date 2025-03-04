package org.example;

public class operadores  {
    public static void main(String[] args) {
        // 1. Tipos de Datos
        byte numeroPequeño = 100;
        short numeroCorto = 32000;
        int numeroEntero = 1000000;
        long numeroLargo = 10000000000L;
        float numeroDecimal = 3.14f;
        double numeroPreciso = 3.1415926535;
        char caracter = 'A';
        boolean esVerdadero = true;
        String texto = "Hola, Java!";

        System.out.println("Tipos de Datos:");
        System.out.println("Byte: " + numeroPequeño);
        System.out.println("Short: " + numeroCorto);
        System.out.println("Int: " + numeroEntero);
        System.out.println("Long: " + numeroLargo);
        System.out.println("Float: " + numeroDecimal);
        System.out.println("Double: " + numeroPreciso);
        System.out.println("Char: " + caracter);
        System.out.println("Boolean: " + esVerdadero);
        System.out.println("String: " + texto);
        System.out.println("-------------------------------------");

        // 2. Operadores Aritméticos
        int a = 10, b = 5;
        System.out.println("Operadores Aritméticos:");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("-------------------------------------");

        // 3. Operadores Relacionales
        System.out.println("Operadores Relacionales:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("-------------------------------------");

        // 4. Operadores Lógicos
        boolean x = true, y = false;
        System.out.println("Operadores Lógicos:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println("-------------------------------------");

        // 5. Operadores de Asignación
        int num = 10;
        System.out.println("Operadores de Asignación:");
        num += 5;
        System.out.println("num += 5: " + num);
        num -= 3;
        System.out.println("num -= 3: " + num);
        num *= 2;
        System.out.println("num *= 2: " + num);
        num /= 4;
        System.out.println("num /= 4: " + num);
        num %= 3;
        System.out.println("num %= 3: " + num);
        System.out.println("-------------------------------------");

        // 6. Operadores de Incremento y Decremento
        int valor = 5;
        System.out.println("Operadores de Incremento y Decremento:");
        System.out.println("Valor original: " + valor);
        System.out.println("Pre-incremento (++valor): " + (++valor));
        System.out.println("Post-incremento (valor++): " + (valor++));
        System.out.println("Después del post-incremento: " + valor);
        System.out.println("Pre-decremento (--valor): " + (--valor));
        System.out.println("Post-decremento (valor--): " + (valor--));
        System.out.println("Después del post-decremento: " + valor);
    }
}