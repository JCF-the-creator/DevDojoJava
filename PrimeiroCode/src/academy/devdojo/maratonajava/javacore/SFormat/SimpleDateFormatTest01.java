package academy.devdojo.maratonajava.javacore.SFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html 
        //Link acime é a documentação da ferramenta abaixo

        String pattern = "yyyy.MM.dd G 'at' hh:mm:ss z"; // Aqui se configura a formatação da data a ser apresentada
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        

        System.out.println(sdf.format(new Date()));

        System.out.println("----------------------------");
        String p2 = "'Brasil,' dd 'de' MMMM 'de' YYYY"; 
        SimpleDateFormat sdf2 = new SimpleDateFormat(p2);
        

        System.out.println(sdf2.format(new Date()));
    }
}
