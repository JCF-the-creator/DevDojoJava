package academy.devdojo.maratonajava.javacore.URegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        //Regex é utilizado para validações como por exemplo um email
        //Utilize o site Regex.com ele é um bom exemplo de funcionamento do regex


        String regex = "ab";
        String texto = "abaaba";

        String regex2 = "aba";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex); //Seta o Pattern
        Matcher matcher = pattern.matcher(texto); // Verifica se possui no pattern 

        System.out.println("texto:  "+texto);
        System.out.println("indice: 012345");
        System.out.println("regex:  "+ regex);
        System.out.println("Posições encontradas: ");
        System.out.println();

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n"); //mostra onde foi encontrado as posições do pattern, matcher.group mostra o valor encontrado
        }

        Pattern pattern2 = Pattern.compile(regex2); //Seta o Pattern
        Matcher matcher2 = pattern2.matcher(texto2); // Verifica se possui no pattern 

        System.out.println("texto2:  "+texto2);
        System.out.println("indice: 0123456");
        System.out.println("regex2:  "+ regex2);
        System.out.println("Posições encontradas: ");
        System.out.println();

        while (matcher2.find()) {
            System.out.println(matcher2.start() + " "+ matcher2.group() + "\n"); //faz a leitura da posição abababa temos as posições 0(a) 1(b) 2(a) 3(b) 4(a) 5(b) 6(a), a primeira leitura do regex "aba" lê as posições 0,1,2; Depois continua a partir da terceira posição assim ignorando o regex na posição 2,3,4
        }

    }
}
