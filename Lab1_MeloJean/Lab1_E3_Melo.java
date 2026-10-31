/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 22-10-2026
 * Ejercicio E3: leer un entero de cuatro cifras y mostrar la suma de
 * sus cifras, el numero invertido y si es par.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E3_Melo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Numero de cuatro cifras: ");
        int n = sc.nextInt();

        if (n < 1000 || n > 9999) {
            System.out.println("El numero debe tener cuatro cifras (1000 a 9999).");
        } else {
            // Proceso: extraccion de cifras con / y %
            int millares = n / 1000;
            int centenas = (n / 100) % 10;
            int decenas = (n / 10) % 10;
            int unidades = n % 10;

            int suma = millares + centenas + decenas + unidades;
            int invertido = unidades * 1000 + decenas * 100 + centenas * 10 + millares;
            boolean esPar = n % 2 == 0;

            // Salida: el invertido es un int, por eso 0852 se muestra como 852
            System.out.println("Suma de cifras: " + suma);
            System.out.println("Invertido: " + invertido);
            System.out.println("Es par: " + esPar);
        }

        sc.close();
    }
}
