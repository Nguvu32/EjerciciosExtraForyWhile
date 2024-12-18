public class Ejercicio7 {
    public static void main(String[] args) {
        int filas = 5;

        for (int fila = 1; fila <= filas; fila++) {
            for (int columna = filas; columna >= fila; columna--) {
                System.out.print("*");
            }
            for (int huecos = filas; huecos > fila; huecos--) {
                System.out.print(" ");
            }
            for (int asterisco=filas; asterisco>1; asterisco--){

            }

            System.out.println();

        }
    }
}
