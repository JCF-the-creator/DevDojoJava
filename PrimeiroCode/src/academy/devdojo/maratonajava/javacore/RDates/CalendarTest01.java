package academy.devdojo.maratonajava.javacore.RDates;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        //Calendar é uma classe abstrada que possui 3 opções, Calendario imperial Japones, Gregoriano(utilizado no Ocidente) e Budista 
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println();
        System.out.println("Usando date");
        System.out.println();
        Date date = c.getTime(); //Jeito mais simples de formatar o Calendar
        System.out.println(date);

        System.out.println();
        //Dessa maneira o codigo abaixo seta o Domingo como o primeiro dia da semana
        System.out.println("Setando o primeiro dia da semana");
        System.out.println();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana"); 
        }

        System.out.println();
        System.out.println("Verificando o dia do calendario");
        System.out.println();
        //possibilidades com Calendar
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));


        System.out.println();
        System.out.println("Usando o .add");
        System.out.println();
        //.add adiciona tempo ao calendario 
        c.add(Calendar.DAY_OF_MONTH, 2); //adicona 2 dias
        Date date2 = c.getTime();
        System.out.println(date2);

        System.out.println();
        System.out.println("Usando o .roll");
        System.out.println();
        //.roll adiciona o tempo ao calendario porem não utrapassa alem do que foi setado, ou seja, setar horas e o tempo adicionado passar o dia, ele mantem o mesmo dia
        c.roll(Calendar.HOUR, 13); //adiciona 13h mais n muda a data
        Date date3 = c.getTime(); 
        System.out.println(date3);
        
    }
}
