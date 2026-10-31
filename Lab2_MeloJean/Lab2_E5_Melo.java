
/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 30-10-2026
 * Realizar "Cajero Automatico"
 * */    

import java.util.Scanner;

public class Lab2_E5_Melo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 500;
        double monto;
        int opcion;

        do {
            System.out.println("\nCAJERO AUTOMATICO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.printf("Saldo: $%.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Monto a depositar: ");
                    monto = sc.nextDouble();

                    if (monto > 0) {
                        saldo += monto;
                        System.out.println("Deposito aceptado.");
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;

                case 3:
                    System.out.print("Monto a retirar: ");
                    monto = sc.nextDouble();

                    if (monto <= 0) {
                        System.out.println("Monto invalido.");
                    } else if (monto > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= monto;
                        System.out.println("Retiro exitoso.");
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}


