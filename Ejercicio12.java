public class Ejercicio12 {
    public static void main(String []args){
        String cadena = "esto1234es5678bueno900";
        System.out.println(devolucionA(cadena));
        System.out.println(devolucionB(cadena));
    }
    public static String devolucionA(String s1){
        return s1.replaceAll("es", "no por");
    }
    public static String devolucionB(String s1){
        return s1.replaceAll("\\d+", "*");
    }
}
