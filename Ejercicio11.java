import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, primerApellido, segundoApellido;
        System.out.println("Introduce tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Introduce tu primer apellido");
        primerApellido = scanner.nextLine();
        System.out.println("Introduce tu segundo apellido");
        segundoApellido = scanner.nextLine();
        String resultado;
        resultado = completo(nombre, primerApellido, segundoApellido);
        System.out.println("");
        System.out.println(resultado);
        System.out.println("");
        System.out.println("ACTIVIDAD A");
        resultado = ejA(nombre, primerApellido, segundoApellido);
        System.out.println("ACTIVIDAD B");
        resultado = ejB(nombre, primerApellido, segundoApellido);
        System.out.println("ACTIVIDAD C");
        resultado = ejC(nombre, primerApellido, segundoApellido);
        System.out.println("ACTIVIDAD D");
        resultado = ejD(nombre, primerApellido, segundoApellido);
        System.out.println("ACTIVIDAD E");
        resultado = ejE(nombre, primerApellido, segundoApellido);
        System.out.println("ACTIVIDAD F");
        resultado = ejF(nombre, primerApellido, segundoApellido);
        System.out.println("ACTIVIDAD G");
        resultado = ejG(nombre, primerApellido, segundoApellido);

    }


    public static String completo(String nombre, String primerApellido, String segundoApellido) {
        StringBuilder completo = new StringBuilder();
        completo.append(nombre);
        completo.append(" ");
        completo.append(primerApellido);
        completo.append(" ");
        completo.append(segundoApellido);
        return completo.toString();
    }

    public static String ejA(String nombre, String primerApellido, String segundoApellido) {
        String s1 = nombre + primerApellido + segundoApellido;
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        return s1;

    }

    public static String ejB(String nombre, String primerApellido, String segundoApellido) {
        String s1 = nombre + primerApellido + segundoApellido;
        if (s1.length() >= 5) {
            String newS1 = s1.substring(0, 5);
            System.out.println(newS1);
        }
        return s1;
    }

    public static String ejC(String nombre, String primerApellido, String segundoApellido) {
        String s1 = nombre + primerApellido + segundoApellido;
        if (s1.length() >= 2) {
            String newS1 = s1.substring(s1.length() - 2);
            System.out.println(newS1);
        }
        return s1;
    }

    public static String ejD(String nombre, String primerApellido, String segundoApellido) {
        String s1 = nombre + primerApellido + segundoApellido;
        if (s1.length() > 0) {
            char ultimoCaracter = s1.charAt(s1.length() - 1);

            // Contar ocurrencias del último carácter
            int contador = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == ultimoCaracter) {
                    contador++;
                }
            }
            System.out.println("El número de ocurrencias del último carácter " + ultimoCaracter + " es: " + contador);

        }
        return s1;
    }
        public static String ejE(String nombre, String primerApellido, String segundoApellido) {
            String s1 = nombre + primerApellido + segundoApellido;
            if (s1.length() > 0) {
                char primerCaracter = s1.charAt(0);
                String mayus = s1.toUpperCase(); //caracteres a mayuscula
                // Contar ocurrencias del primer caracter
                int contador = 0;
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) == primerCaracter) {
                        contador++;
                    }
                }
                System.out.println("El número de ocurrencias del primer carácter " + primerCaracter + " es: " + contador + " Cadena en mayúsculas: " + mayus);
            }
            return s1;
    }
        public static String ejF(String nombre, String primerApellido, String segundoApellido) {
            String s1 = nombre + primerApellido + segundoApellido;
            System.out.println("***" + s1 + "***");
            return s1;
        }
        public static String ejG(String nombre, String primerApellido, String segundoApellido) {
            String s1 = nombre + primerApellido + segundoApellido;
            StringBuilder fraseInversa = new StringBuilder();
            //Bucle comienza desde la última posición de la cadena original (cadena.length() - 1) y se mueve hacia atrás hasta la primera posición (i >= 0).
            for (int i = s1.length() - 1; i >= 0; i--){
                fraseInversa.append(s1.charAt(i));
            }
            System.out.println(fraseInversa);

            return s1;
    }
}



