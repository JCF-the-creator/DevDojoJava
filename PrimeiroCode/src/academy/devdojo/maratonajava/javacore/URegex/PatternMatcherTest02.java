package academy.devdojo.maratonajava.javacore.URegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // Principais Meta Caracteres
        // \d = Todos os Digitos
        // \D = Tudo que não for digito
        // \s = Espaços em branco inclusive os \t,\n,\f,\r 
        // \S = Todos excluindos os em Branco
        // \w = a-z, A-Z, digitos, _
        // \W = Tudo que não for \w

        String regex = "\\d";
        String texto = "jh8e1kn3kn340";


        Pattern pattern = Pattern.compile(regex); //Seta o Pattern
        Matcher matcher = pattern.matcher(texto); // Verifica se possui no pattern 

        System.out.println("texto:  "+texto);
        System.out.println("indice: 012345...");
        System.out.println("regex:  "+ regex);
        System.out.println();

        while (matcher.find()) {
            System.out.println("posição do indice = " + matcher.start() + ", encontrado o valor = "+ matcher.group() + "\n"); 
        }

        String regex2 = "\\D"; 
        String texto2 = "jh&128e1k$@40";

        Pattern pattern2 = Pattern.compile(regex2); //Seta o Pattern
        Matcher matcher2 = pattern2.matcher(texto2); // Verifica se possui no pattern 

        System.out.println("texto:  "+texto2);
        System.out.println("indice: 012345...");
        System.out.println("regex:  "+ regex2);
        System.out.println();

        while (matcher2.find()) {
            System.out.println("posição do indice = " + matcher2.start() + ", encontrado o valor = "+ matcher2.group() + "\n"); 
        }

    }
}
