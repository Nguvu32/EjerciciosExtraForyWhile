public class Ejercicio6 {
    public static void main(String[] args) {
        int filas = 10;

        for (int fila = 1; fila <= filas; fila++) {
            for (int huecos = 1; huecos < fila; huecos++) {
                System.out.print(" ");
            }
            for (int columna = filas*2; columna >= (fila*2); columna--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

