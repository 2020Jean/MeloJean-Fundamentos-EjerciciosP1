/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 22-10-2026
 * Ejercicio E4: leer producto, cantidad y precio unitario; calcular
 * subtotal, IVA del 15 % y total, y mostrar la factura en columnas.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Melo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double IVA = 0.15; // tarifa fija

        // Entrada: el nombre se lee primero con nextLine (admite espacios)
        System.out.print("Producto: ");
        String producto = sc.nextLine();
        System.out.print("Cantidad y precio unitario: ");
        int cantidad = sc.nextInt();
        double precio = sc.nextDouble();

        // Proceso
        double subtotal = cantidad * precio;
        double valorIva = subtotal * IVA;
        double total = subtotal + valorIva;

        // Salida en columnas alineadas
        System.out.printf("%-25s%10.2f%n", "Subtotal", subtotal);
        System.out.printf("%-25s%10.2f%n", "IVA 15%", valorIva);
        System.out.printf("%-25s%10.2f%n", "TOTAL", total);

        sc.close();
    }
}
