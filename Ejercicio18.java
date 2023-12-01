import java.util.Arrays;
public class Ejercicio18 {
    public static void main(String[] args) {
        int[] arrayUno = new int[]{1, 2, 34, 45, 566, 23, 6, 4, 45, 4};
        int[] arrayDos = new int[]{1, 2, 34, 45, 566, 23, 6, 4, 45, 4};
        System.out.println("Primer array" + Arrays.toString(arrayUno));
        System.out.println("Segundo array" + Arrays.toString(arrayDos));
        System.out.println("");
        int[] suma = suma(arrayUno, arrayDos);
        System.out.println("Suma" + Arrays.toString(suma));
        double[] division = division(arrayUno, arrayDos);
        System.out.println("Division" + Arrays.toString(division));
    }
    public static int[] suma(int[] arrayUno, int[] arrayDos) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = arrayUno[i] + arrayDos[i];
        }
        return array;
    }

    public static double[] division(int[] arrayUno, int[] arrayDos) {
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (double) arrayUno[i] / arrayDos[i];

        }
        return array;
    }
}

