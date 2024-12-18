public class Ejercicio3 {
    public static void main(String[] args) {
// crea esto
//  1
//  22
//  333
//  4444
//  55555
        int filas = 5;

        for (int fila = 1; fila <= filas; fila++) {
            for (int x = 1; x <= fila; x++) {
                System.out.print(fila);
            }
            System.out.println(" ");
        }

    }
}
