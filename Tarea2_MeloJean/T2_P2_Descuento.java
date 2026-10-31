import java.util.Locale;
import java.util.Scanner;

public class T2_P2_Descuento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        final double COSTO_SACO = 8.50;
        final double FACTOR_IVA = 0.15;
        final double REBAJA_MEDIA = 0.05;
        final double REBAJA_ALTA = 0.10;

        System.out.print("Sacos a comprar: ");
        int sacosComprados = lector.nextInt();

        if (sacosComprados < 1) {
            System.out.println("Dato incorrecto: se requiere al menos 1 saco.");
        } else {
            double porcentajeRebaja = 0.0;
            if (sacosComprados >= 51) {
                porcentajeRebaja = REBAJA_ALTA;
            } else if (sacosComprados >= 21) {
                porcentajeRebaja = REBAJA_MEDIA;
            }

            double importe = sacosComprados * COSTO_SACO;
            double montoRebaja = importe * porcentajeRebaja;
            double baseImponible = importe - montoRebaja;
            double montoIva = baseImponible * FACTOR_IVA;
            double totalPagar = baseImponible + montoIva;

            System.out.printf("Importe sin descuento: $%.2f%n", importe);
            System.out.printf("Descuento aplicado:    $%.2f%n", montoRebaja);
            System.out.printf("IVA (15%%):             $%.2f%n", montoIva);
            System.out.printf("Total a cobrar:        $%.2f%n", totalPagar);
        }
        lector.close();
    }
}
