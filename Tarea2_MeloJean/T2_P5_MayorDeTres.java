import java.util.Locale;
import java.util.Scanner;

public class T2_P5_MayorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        System.out.print("Valor 1: ");
        double uno = lector.nextDouble();
        System.out.print("Valor 2: ");
        double dos = lector.nextDouble();
        System.out.print("Valor 3: ");
        double tres = lector.nextDouble();

        if (uno == dos || uno == tres || dos == tres) {
            System.out.println("Dato incorrecto: los tres valores deben ser diferentes.");
        } else {
            double temp;
            if (uno < dos) {
                temp = uno;
                uno = dos;
                dos = temp;
            }
            if (uno < tres) {
                temp = uno;
                uno = tres;
                tres = temp;
            }
            if (dos < tres) {
                temp = dos;
                dos = tres;
                tres = temp;
            }
            System.out.println("Ordenados de mayor a menor: " + uno + " | " + dos + " | " + tres);
        }
        lector.close();
    }
}
