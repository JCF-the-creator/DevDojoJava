package academy.devdojo.maratonajava.javacore.RDates;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //Date funciona em sistemas legados, sendo assim não utilizado em sistemas atuais por estar muito desatualizado
        Date date = new Date(); //a classe date se utiliza com long para declarar a data, a data é declarada em ms
        date.setTime(date.getTime()+3_600_000);//3600000 é para adicionar 1h a data atual
        System.out.println(date);
    }
}
