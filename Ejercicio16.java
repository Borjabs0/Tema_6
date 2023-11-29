import java.util.Random;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Declarar un array de 30 elementos de tipo double
        double[] notas = generarNotas(30);

        // Imprimir la media de elementos mayores o iguales a 5
        calcularYMostrarMedia(notas, 5);

        // Imprimir la media total
        calcularYMostrarMediaTotal(notas);
    }

    // Método para generar un array de notas aleatorias
    private static double[] generarNotas(int cantidad) {
        double[] notas = new double[cantidad];
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            notas[i] = random.nextDouble() * 10;
        }
        return notas;
    }

    // Método para calcular y mostrar la media de elementos mayores o iguales a un valor dado
    private static void calcularYMostrarMedia(double[] array, double umbral) {
        double suma = 0;
        int contador = 0;

        for (double elemento : array) {
            if (elemento >= umbral) {
                suma += elemento;
                contador++;
            }
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("Media de elementos mayores o iguales a " + umbral + ": " + media);
        } else {
            System.out.println("No hay elementos mayores o iguales a " + umbral + ".");
        }
    }

    // Método para calcular y mostrar la media total de un array
    private static void calcularYMostrarMediaTotal(double[] array) {
        double suma = 0;

        for (double elemento : array) {
            suma += elemento;
        }

        double mediaTotal = suma / array.length;
        System.out.println("Media total de todas las notas: " + mediaTotal);
    }
}

