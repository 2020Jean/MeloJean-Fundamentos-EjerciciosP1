// Autor: Jean Melo
import java.util.Scanner;


public class T1_P4_Minutos_Horas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // PRIMERA PARTE: ENTRADA DE DATOS
        System.out.println("Ingrese la cantidad de minutos:");
        int minutos = sc.nextInt();


        // SEGUNDA PARTE: PROCESO
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;


        // TERCERA PARTE: SALIDA
        System.out.println(minutos + " minutos = " + horas + " h " + minutosRestantes + " min");
    }
}
