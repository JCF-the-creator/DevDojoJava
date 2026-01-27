package academy.devdojo.maratonajava.javacore.RDates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println();
        System.out.println(Calendar.getInstance());
        System.out.println();
        System.out.println(Month.JANUARY.getValue());
        System.out.println();

        //O uso do LocalDate é utilizado para não interagir com a hora, somente os dias, meses e anos.
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27); 
        //Usando o LocalData, você não precisa usar PARSE para referenciar o objeto
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.isLeapYear());
        //Para obter mais referencias pode se utilizar da interface no pacote java.time 
        System.out.println();
        System.out.println(date.get(ChronoField.ERA));
        //Usando o println de somente date, ele deixa formatado para o uso em Banco de Dados, n necessitando formatar antes de enviar para outro sistema
        System.out.println(date);
        System.out.println();
        //Dessa maneira pega a data atual
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println();
        //Pode se utilizar muito mais datas do que o metodo anterior sendo esse o alcence
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println();
        //Todas as classes Local são privadas, assim não são mudadas, caso queira mudar o valor delas deve-se declarar um nova variavel para guardar o valor
        LocalDate depois = agora.plusWeeks(4);
        System.out.println(depois);
        agora = agora.plusWeeks(4); //sobrescreve o valor 
        System.out.println(agora);
        System.out.println();
        //Pode-se pegar os dados de uma String se ela for escrita da maneira padrão usando o Parse sem precisar lançar uma Exception
        String dia = "2022-08-06";
        LocalDate date3 = LocalDate.parse(dia);
        System.out.println(date3);
    }
}
