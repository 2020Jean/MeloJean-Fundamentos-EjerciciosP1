/*
 * Nombre: Jean Melo
 * NRC: 37712
 * Fecha: 30-10-2026
 * Realizar Tabla de multiplicar completa
 * */


public class Lab2_E1_Melo {
    public static void main(String[] args) {

        // Generar tabla de multiplicar
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }
}

