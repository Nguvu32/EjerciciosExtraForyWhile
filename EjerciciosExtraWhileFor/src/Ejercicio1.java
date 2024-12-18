public class Ejercicio1 {
    public static void main(String[] args) {
        int filas = 7, columnas = 7;

        //https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-de-bucles-anidados-java/
        for (int fila = 1; fila <= filas; fila++) {
            for (int columna = 1; columna <= columnas; columna++) {
                System.out.print("*");
                if (fila == columna){
                    columna = columnas;
                }
            }
            System.out.println(" ");
        }

    }

}

