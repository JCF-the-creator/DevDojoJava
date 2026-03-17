package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.YColection.Dominio.Celular;


public class CelularListTest01 {
    public static void main(String[] args) {
        Celular s1 = new Celular("2BMS", "IPhone");
        Celular s2 = new Celular("2312T", "Pixel");
        Celular s3 = new Celular("985T2", "Samsung");

        List<Celular> celulares = new ArrayList<>();
        celulares.add(s1);
        celulares.add(s2);
        celulares.add(s3);

        for(Celular cel : celulares){
            System.out.println(cel);
        }
    }
}
