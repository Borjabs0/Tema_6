import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array de 10 elementos de tipo char
        char[] charArray = new char[10];

        // Introducir elementos en el array
        introducirElementos(charArray, scanner);

        // Mostrar elementos en posiciones pares
        System.out.println("Elementos en posiciones pares:");
        mostrarPosicionesPares(charArray);

        // Mostrar elementos en posiciones impares
        System.out.println("Elementos en posiciones impares:");
        mostrarPosicionesImpares(charArray);
    }

    // Método para introducir elementos en el array
    private static void introducirElementos(char[] array, Scanner scanner) {
        System.out.println("Introduce 10 elementos de tipo char:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.next().charAt(0);
        }
    }

    // Método para mostrar elementos en posiciones pares
    private static void mostrarPosicionesPares(char[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }

    // Método para mostrar elementos en posiciones impares
    private static void mostrarPosicionesImpares(char[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
}
