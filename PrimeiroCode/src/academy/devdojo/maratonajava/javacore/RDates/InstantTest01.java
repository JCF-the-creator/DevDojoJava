package academy.devdojo.maratonajava.javacore.RDates;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //Instant trabalha parecido com o Date legado, porem funciona a partir dos Nanosegundos de 1970 até agora
        Instant now = Instant.now();
        System.out.println(now); // O T faz no print faz a diferença entre data e tempo, o Z é o zulu time, basicamento é o Fuso Horário 0, São Paulo fica no GMT-3
        System.out.println(LocalDateTime.now());
        System.out.println();
        System.out.println(now.getEpochSecond());//retorna um LONG
        System.out.println(now.getNano());//retorna um inteiro tendo valor maximo 999.999.999
    }
}
