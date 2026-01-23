package academy.devdojo.maratonajava.javacore.SFormat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat02 {
    public static void main(String[] args) {
        //Codigo abaixo mostra como é configurado o sistema de print para valores de moedas de acordo com o local 


        //Em banco de dados normalmente é atribuido primeiro o valor e depois adicionado a moeda a ser utilizada no print
        
        Locale localeDF = Locale.getDefault();
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(localeDF);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[3] = NumberFormat.getCurrencyInstance();

        double valor = 100_223.1241;

        for(NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(valor));
        }
        
    }
}
