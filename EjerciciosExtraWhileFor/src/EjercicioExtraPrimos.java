public class EjercicioExtraPrimos {
    public static void main(String[] args) {
//        El numero de numeros primos que quieres que imprima
        final int PRIMOS = 16;
        int contador = 1;
        int numeroInicial = 1;
        String cadena = "";

        while (contador <= PRIMOS) {
            int a = 1;
            boolean primo = true;

            for (int i = 2; i < numeroInicial; i++) {
                if (numeroInicial % i == 0) {
                    primo = false;
                }
            }
            if (primo == true && numeroInicial > 1) {
                cadena = cadena + " " + numeroInicial;
                contador++;
                numeroInicial++;
            } else {
                numeroInicial++;
            }
        }
        System.out.println(cadena);
    }
}
