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
        // [] = procura todos os caracteres que estão entre []
        // ? = Zero ou 1
        // * = zero ou mais
        // + = 1 ou mais
        // {n,m} = de n até m 
        // | = "o(v|c)o", vai verificar "ovo" ou "oco"
        // $ = fim da linha

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

        String regex3 = "[ap0-9]"; //ele busca por caracter se estiver maiusculo n regex e minusculo no texto mesmo sendoo P ele vai apenas pegar o p
        // Se colocado o - ele verifica entre os valores, no caso do regex 3 entre 0 e 9
        String texto3 = "jaAh&12P8e1kp$@40";

        Pattern pattern3 = Pattern.compile(regex3); //Seta o Pattern
        Matcher matcher3 = pattern3.matcher(texto3); // Verifica se possui no pattern 

        System.out.println("texto:  "+texto3);
        System.out.println("indice: 012345...");
        System.out.println("regex:  "+ regex3);
        System.out.println();

        while (matcher3.find()) {
            System.out.println("posição do indice = " + matcher3.start() + ", encontrado o valor = "+ matcher3.group() + "\n"); 
        }

    }
}
