package academy.devdojo.maratonajava.javacore.QString.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "         Luffy           ";
        String numeros = "012345";
        System.out.println(nome.charAt(4));
        System.out.println(nome.length());

        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.trim());//retira espaços escritos na String
        System.out.println("-------------------");
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3, 5));//sempre vai retornar uma posição a mais no primeiro e a menos no segundo

    }
}
