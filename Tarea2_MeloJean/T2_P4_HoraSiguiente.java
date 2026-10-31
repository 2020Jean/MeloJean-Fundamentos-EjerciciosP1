import java.util.Locale;
import java.util.Scanner;

public class T2_P4_HoraSiguiente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        final int DIA_EN_SEGUNDOS = 86400;

        System.out.print("Escriba la hora (hh mm ss): ");
        int hora = lector.nextInt();
        int minuto = lector.nextInt();
        int segundo = lector.nextInt();

        boolean rangosCorrectos = hora >= 0 && hora <= 23
                && minuto >= 0 && minuto <= 59
                && segundo >= 0 && segundo <= 59;

        if (!rangosCorrectos) {
            System.out.println("Dato incorrecto: use hh 0-23, mm 0-59 y ss 0-59.");
        } else {
            int transcurrido = hora * 3600 + minuto * 60 + segundo;
            int proximo = (transcurrido + 1) % DIA_EN_SEGUNDOS;
            int nuevaHora = proximo / 3600;
            int nuevoMinuto = (proximo % 3600) / 60;
            int nuevoSegundo = proximo % 60;
            System.out.printf("Hora un segundo despues: %02d:%02d:%02d%n", nuevaHora, nuevoMinuto, nuevoSegundo);
        }
        lector.close();
    }
}
