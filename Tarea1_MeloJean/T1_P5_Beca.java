// Autor: Jean Melo
import java.util.Locale;
import java.util.Scanner;


public class T1_P5_Beca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // PRIMERA PARTE: ENTRADA DE DATOS
        System.out.println("Ingrese la edad:");
        int edad = sc.nextInt();
        System.out.println("Ingrese el promedio:");
        double promedio = sc.nextDouble();


        // SEGUNDA PARTE: PROCESO
        boolean puedePostular = edad <= 25 && promedio >= 8.5;


        // TERCERA PARTE: SALIDA
        System.out.println("Puede postular a beca: " + puedePostular);
    }
}

