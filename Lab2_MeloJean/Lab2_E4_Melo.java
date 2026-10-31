/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 30-10-2026
 * Realizar "Rombo de Asteriscos"
 * */

    
import java.util.Scanner;

public class Lab2_E4_Melo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un numero impar positivo: ");
            n = sc.nextInt();

            if (n <= 0 || n % 2 == 0) {
                System.out.println("Numero invalido.");
            }

        } while (n <= 0 || n % 2 == 0);

        int mitad = n / 2;

        // Parte superior del rombo
        for (int i = 0; i <= mitad; i++) {

            for (int j = 0; j < mitad - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Parte inferior del rombo
        for (int i = mitad - 1; i >= 0; i--) {

            for (int j = 0; j < mitad - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}


