import java.util.Locale;
import java.util.Scanner;

public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        System.out.print("Medida del angulo (grados): ");
        double anguloIngresado = lector.nextDouble();

        if (anguloIngresado < 0) {
            System.out.println("Dato incorrecto: el angulo no puede ser negativo.");
        } else {
            double anguloFinal = anguloIngresado;
            if (anguloIngresado > 360) {
                anguloFinal = anguloIngresado % 360;
                System.out.printf("Angulo reducido a %.2f grados%n", anguloFinal);
            }

            String tipo;
            if (anguloFinal == 0) {
                tipo = "nulo";
            } else if (anguloFinal < 90) {
                tipo = "agudo";
            } else if (anguloFinal == 90) {
                tipo = "recto";
            } else if (anguloFinal < 180) {
                tipo = "obtuso";
            } else if (anguloFinal == 180) {
                tipo = "llano";
            } else if (anguloFinal < 360) {
                tipo = "concavo";
            } else {
                tipo = "completo";
            }
            System.out.printf("%.2f grados -> angulo %s%n", anguloIngresado, tipo);
        }
        lector.close();
    }
}
