/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 30-10-2026
 * Realizar "Adivina el numero"
 * */

import java.util.Scanner;
import java.util.Random;

public class Lab2_E3_Melo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random azar = new Random();

        int secreto = azar.nextInt(100) + 1;
        int numero;
        int intentos = 0;
        boolean acerto = false;

        System.out.println("ADIVINA EL NUMERO");
        System.out.println("Numero entre 1 y 100");
        System.out.println("Tienes 7 intentos");

        do {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();
            intentos++;

            if (numero == secreto) {
                acerto = true;
                System.out.println("Correcto!");
            } else if (numero < secreto) {
                System.out.println("Mas alto");
            } else {
                System.out.println("Mas bajo");
            }

            System.out.println("Intento: " + intentos);

        } while (!acerto && intentos < 7);

        if (acerto) {
            System.out.println("Ganaste en " + intentos + " intentos.");
        } else {
            System.out.println("Perdiste.");
            System.out.println("El numero era: " + secreto);
        }

        sc.close();
    }
}

