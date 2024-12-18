public class Ejercicio5 {
    public static void main(String[] args) {
        int filas = 10;

        for (int fila = 1; fila <= filas; fila++) {
            for (int huecos = filas; huecos > fila; huecos--) {
                System.out.print(" ");
            }
            for (int columna = 1; columna < (2 * fila); columna++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
