// Autor: Jean Melo
import java.util.Locale;
import java.util.Scanner;

public class T1_P1_Rectangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // PRIMERA PARTE: ENTRADA DE DATOS
        System.out.println("Ingrese la base:");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura:");
        double altura = sc.nextDouble();


        // SEGUNDA PARTE: PROCESO
        double area = base * altura;
        double perimetro = 2 * (base + altura);


        // TERCERA PARTE: SALIDA
        System.out.printf("El area es: %.2f%n", area);
        System.out.printf("El perimetro es: %.2f%n", perimetro);
    }
}
