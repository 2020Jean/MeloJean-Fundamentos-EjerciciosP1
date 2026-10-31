// Autor: Jean Melo
public class T1_P6_Asignacion_compuesta {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("int x = 4;   -> x = " + x);


        x *= 3;
        System.out.println("x *= 3;      -> x = " + x);


        x %= 5;
        System.out.println("x %= 5;      -> x = " + x);


        x += x++;
        System.out.println("x += x++;    -> x = " + x);
    }
}
