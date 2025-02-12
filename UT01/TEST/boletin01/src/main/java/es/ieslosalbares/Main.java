package es.ieslosalbares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("escribe un numero");
        int num1 = teclado.nextInt();
        System.out.println("escribe otro numero");
        int num2 = teclado.nextInt();
        System.out.println(ejercicio01(num1 , num2));

    }

    public static String ejercicio01(int num1, int num2) {        
        if (num1>num2) {
            return num1 + " es mayor que " + num2;
        }
        else if (num2>num1) {
            return num2 + " es mayor que " + num1;
        }
        else {
            return num1 + " y " +num2 + " son iguales";
        }
    }
}