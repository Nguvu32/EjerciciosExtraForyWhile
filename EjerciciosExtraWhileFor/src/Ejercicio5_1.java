public class Ejercicio5_1 {
    public static void main(String[] args) {
        int altura = 5;


        for (int numeroespacios = altura, numeroasteriscos = 1; numeroasteriscos <= (altura * 2) - 1; numeroespacios--, numeroasteriscos += 2) {
            //Espacios
            for (int i = 0; i < numeroespacios; i++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int j = numeroasteriscos; j != 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}