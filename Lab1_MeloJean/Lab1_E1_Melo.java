/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 22-10-2026
 * Ejercicio E1: leer grados Celsius y mostrar su equivalente en
 * Fahrenheit y Kelvin en una tabla alineada con 2 decimales.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Melo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // punto decimal
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        // Proceso: se usa 9.0/5.0 para evitar la division entera
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        double kelvin = celsius + 273.15;

        // Salida: etiqueta a la izquierda (12) y valor a la derecha (10)
        System.out.printf("%-12s%10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s%10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s%10.2f%n", "Kelvin", kelvin);

        sc.close();
    }
}
