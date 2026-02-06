package academy.devdojo.maratonajava.javacore.RDates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); //mostra a chave e o valor das zonas suportadas
        System.out.println();
        System.out.println(ZoneId.systemDefault()); //retorna a zona que o Computador se encontra
        System.out.println();

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); //Caso o texto não seja igual aos oferecidos no SHORT_IDS da uma excessão
        System.out.println(tokyoZone);
        System.out.println();

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println();
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone); //mostra a quantas horas o computador está da zona declarada
        System.out.println(zonedDateTime);
        System.out.println();

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        System.out.println();
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
        System.out.println(); //No Instant por ele já realiza a soma da hora no ZuluTime 

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        System.out.println();

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");// setando o Offset
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus); //O Offset adiciona ou tira a hora setada, porem não infroma ainda a zona atribuida 
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);
        System.out.println();

        //mostra a era da zona
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
