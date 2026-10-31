// Autor: Jean Melo
import java.util.Scanner;


public class T1_P2_EsPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // PRIMERA PARTE: ENTRADA DE DATOS
        System.out.println("Ingrese un numero entero:");
        int numero = sc.nextInt();


        // SEGUNDA PARTE Y TERCERA PARTE: la expresion se imprime directamente
        System.out.println("Es par: " + (numero % 2 == 0));
    }
}

