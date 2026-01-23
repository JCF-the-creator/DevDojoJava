package academy.devdojo.maratonajava.javacore.SFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat01 {
    public static void main(String[] args) {
        //Codigo abaixo mostra como é configurado o sistema de print para valores de acordo com o local 
        Locale localeDF = Locale.getDefault();
        Locale localeJP = Locale.JAPAN;
        NumberFormat[] nfa = new NumberFormat[3];

        nfa[0] = NumberFormat.getInstance(localeDF);
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance();

        double valor = 100_000_223.1241;

        for(NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(valor));
        }
    }
}
