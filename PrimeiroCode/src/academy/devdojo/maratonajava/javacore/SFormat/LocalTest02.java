package academy.devdojo.maratonajava.javacore.SFormat;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {

        //o codigo abaixo indentifica o que é suportado no seu SO
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for(String isoLanguage : isoLanguages){
            System.out.print(isoLanguage + " ");
        }

        System.out.println();
        for(String isoCountry : isoCountries){
            System.out.print(isoCountry + " ");
        }
    }
}
