import java.util.Locale;
import java.util.Scanner;

public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        System.out.print("Parcial 1 (de 20): ");
        double examen1 = lector.nextDouble();
        System.out.print("Parcial 2 (de 20): ");
        double examen2 = lector.nextDouble();
        System.out.print("Parcial 3 (de 20): ");
        double examen3 = lector.nextDouble();

        boolean datosCorrectos = examen1 >= 0 && examen1 <= 20
                && examen2 >= 0 && examen2 <= 20
                && examen3 >= 0 && examen3 <= 20;

        if (!datosCorrectos) {
            System.out.println("Dato incorrecto: cada nota debe estar entre 0 y 20.");
        } else {
            double mediaFinal = (examen1 + examen2 + examen3) / 3;
            System.out.printf("Promedio final: %.2f%n", mediaFinal);
            if (mediaFinal >= 14) {
                System.out.println("Resultado: Aprobado");
            } else if (mediaFinal >= 9) {
                System.out.println("Resultado: Supletorio");
            } else {
                System.out.println("Resultado: Reprobado");
            }
        }
        lector.close();
    }
}
