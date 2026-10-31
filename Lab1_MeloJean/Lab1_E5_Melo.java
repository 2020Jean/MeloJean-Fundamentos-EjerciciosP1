/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 22-10-2026
 * Ejercicio E5: evaluar cuatro expresiones aritmeticas, relacionales y
 * logicas para comparar el valor calculado a mano con el ejecutado.
 */
import java.util.Locale;

public class Lab1_E5_Melo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int a = 9, b = 4;

        // 1) /, % y * van de izquierda a derecha antes de la suma
        int r1 = a / b + a % b * 2;

        // 2) aritmetica, luego relacionales, luego &&
        boolean r2 = 10 - 3 * 2 > 3 && 5 % 2 == 1;

        // 3) el cast afecta solo al 7 de la izquierda
        double r3 = (double) 7 / 2 + 7 / 2;

        // 4) ! sobre el parentesis, luego relacionales, luego ||
        boolean r4 = !(4 >= 4) || 2 * 3 != 6;

        System.out.printf("%-45s%s%n", "Expresion", "Valor ejecutado");
        System.out.printf("%-45s%d%n", "a / b + a % b * 2", r1);
        System.out.printf("%-45s%b%n", "10 - 3 * 2 > 3 && 5 % 2 == 1", r2);
        System.out.printf("%-45s%.1f%n", "(double) 7 / 2 + 7 / 2", r3);
        System.out.printf("%-45s%b%n", "!(4 >= 4) || 2 * 3 != 6", r4);
    }
}
