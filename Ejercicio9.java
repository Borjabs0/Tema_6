public class Ejercicio9 {
    public static void main(String []args) {
        String frase = "Hola pepe ayer te vi en la montaña";
        String resultado = otraFrase(frase);
        System.out.println(resultado);
    }
        public static String otraFrase(String s1){
           StringBuilder  newFrase = new StringBuilder();
           s1 = s1.trim().replaceAll("\\s", " ");
           for(int i =0; i < s1.length(); i++){

               if (i%2 != 0){
                   newFrase.append(s1.charAt(i));
               }


           }
           return newFrase.toString();
        }

}
