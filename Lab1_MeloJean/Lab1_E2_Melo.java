/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 22-10-2026
 * Ejercicio E2: leer un tiempo total en segundos y mostrarlo en
 * horas, minutos y segundos.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E2_Melo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Tiempo total en segundos: ");
        int total = sc.nextInt();

        // Proceso: division entera y modulo
        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        // Salida
        System.out.printf("%d s = %d h %d min %d s%n", total, horas, minutos, segundos);

        sc.close();
    }
}
