/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 30-10-2026
 * Realizar Estadisticas de un sensor
 * */

 
import java.util.Scanner;

public class Lab2_E2_Melo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double suma = 0;
        double maximo = 0;
        double minimo = 0;

        System.out.print("Ingrese temperatura: ");
        double temperatura = sc.nextDouble();

        while (temperatura >= 0) {

            if (contador == 0) {
                maximo = temperatura;
                minimo = temperatura;
            }

            if (temperatura > maximo) {
                maximo = temperatura;
            }

            if (temperatura < minimo) {
                minimo = temperatura;
            }

            suma += temperatura;
            contador++;

            System.out.print("Ingrese temperatura: ");
            temperatura = sc.nextDouble();
        }

        if (contador > 0) {
            double promedio = suma / contador;

            System.out.println("Lecturas: " + contador);
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.printf("Max: %.2f%n", maximo);
            System.out.printf("Min: %.2f%n", minimo);
        } else {
            System.out.println("No hay ");
        }

        sc.close();
    }
}

