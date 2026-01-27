package academy.devdojo.maratonajava.javacore.RDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        //Local DateTime é a junção das 2 classes, sendo utilizada quando as 2 são necessárias 
        LocalDateTime horaEData = LocalDateTime.now();
        System.out.println(horaEData);
        System.out.println();
        
        LocalDate date = LocalDate.parse("2045-08-23");
        LocalTime time = LocalTime.parse("11:34:42");
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1+" Aqui foi adicionado a data");
        System.out.println(ldt2+" Aqui foi adicionado a Hora");

    }
}
