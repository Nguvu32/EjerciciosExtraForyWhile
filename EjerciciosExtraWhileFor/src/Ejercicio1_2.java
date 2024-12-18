public class Ejercicio1_2 {
    public static void main(String[] args) {
        int filas = 7;

        for (int fila = 1; fila <= filas; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}