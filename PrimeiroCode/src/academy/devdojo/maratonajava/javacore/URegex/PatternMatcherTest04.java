package academy.devdojo.maratonajava.javacore.URegex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        
        String regex = "([0-9a-zA-Z\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //um email pode ter a-z, A-Z, 0-9, \\.(\\ transforma . em texto), _,,- se repetindo 1 ou mais vezes. Depois vem o provedor depois do @ possuindo a-z, A-Z. O .com utiliza \\. e a-z

        String emails= "anderson@gmail.com, 123pedro@hotmail.com, @#mariana@mail.br, milena@mail";

        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(emails); 

        System.out.println("texto:  "+ emails);
        System.out.println();
        System.out.println("regex:  "+ regex);
        System.out.println();


        while (matcher.find()) {
            System.out.println("posição do indice = " + matcher.start() + ", encontrado o valor = "+ matcher.group() + "\n"); 
        }

        System.out.println();
        System.out.println("Email válido");
        System.out.println("#@!leonardo@gmail.br".matches(regex));
        System.out.println();

        List<String> listaEmails = Arrays.asList(emails.split(","));//produz uma lista separando a partir das ","

        for(String e: listaEmails){
            e = e.trim(); //retira o espaço nos emails 
            System.out.println("o email \"" + e + "\" é válido?");
            System.out.println(e.matches(regex));
            System.out.println();
        }
    }
}
