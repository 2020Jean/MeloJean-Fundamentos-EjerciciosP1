import java.util.Locale;
import java.util.Scanner;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la resistencia R1 (ohm): ");
        double resistA = lector.nextDouble();
        System.out.print("Ingrese la resistencia R2 (ohm): ");
        double resistB = lector.nextDouble();
        System.out.print("Forma de conexion, S (serie) o P (paralelo): ");
        char modo = Character.toUpperCase(lector.next().charAt(0));

        if (resistA <= 0 || resistB <= 0) {
            System.out.println("Dato incorrecto: ambas resistencias deben ser positivas.");
        } else {
            double resultado;
            switch (modo) {
                case 'S':
                    resultado = resistA + resistB;
                    System.out.printf("Equivalente en serie: %.2f ohm%n", resultado);
                    break;
                case 'P':
                    resultado = (resistA * resistB) / (resistA + resistB);
                    System.out.printf("Equivalente en paralelo: %.2f ohm%n", resultado);
                    break;
                default:
                    System.out.println("Dato incorrecto: la conexion debe ser S o P.");
            }
        }
        lector.close();
    }
}
