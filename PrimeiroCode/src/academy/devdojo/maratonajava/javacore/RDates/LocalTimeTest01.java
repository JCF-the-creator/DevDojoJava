package academy.devdojo.maratonajava.javacore.RDates;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        //A hora vai 0-23, minutos e segundos 0-59, fora desses valores ocorre erro
        LocalTime time = LocalTime.of(23, 59,50);
        System.out.println(time);
        System.out.println();

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        System.out.println();
        
        //Utiliza da mesma forma que o LocalDate a diferença é que se pode utilizar como comando o .MIN para pegar o inicio do dia e o .MAX o final do dia, utilizado em relatorios para se obter todos os relatorios daquele dia

        System.out.println(LocalTime.MIDNIGHT + " Meia noite");//mostra apenas horario da meia noite, não referencia como valor minimo do dia

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.NOON + " Meio dia");
        }
}
