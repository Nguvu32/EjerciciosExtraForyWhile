public class Ejercicio2 {
    public static void main(String[] args) {
        int filas = 7;

        for (int fila = 1; fila <= filas; fila++) {
            for (int columna = filas; columna > fila; columna--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}