import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar un array de 20 elementos numéricos
        int[] array = new int[20];

        // Introducir elementos en el array
        System.out.println("Introduce 20 números:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Visualizar elementos de 4 en 4 en una tabla tabulada
        visualizarEnTabla(array);

        scanner.close();
    }

    // Método para visualizar elementos de un array en una tabla tabulada
    public static void visualizarEnTabla(int[] array) {
        System.out.println("\nVisualización en tabla tabulada:");

        for (int i = 0; i < array.length; i += 4) {
            System.out.printf("%-8d%-8d%-8d%-8d%n", array[i], array[i + 1], array[i + 2], array[i + 3]);
        }
    }
}
