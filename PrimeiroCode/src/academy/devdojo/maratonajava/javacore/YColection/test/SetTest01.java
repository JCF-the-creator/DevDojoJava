package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.HashSet;
import java.util.Set;

import academy.devdojo.maratonajava.javacore.YColection.Dominio.Manga;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); // HashSet é uma coleção que permite apenas elementos unicos, onde os valores são inseridos no Hash podendo ser alterados
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.99, 0));
        mangas.add(new Manga(1L, "Berserk", 29.99, 5));
        mangas.add(new Manga(6L, "Attack on titan", 9.99, 0));
        mangas.add(new Manga(8L, "Pokemon", 15.9, 2));
        mangas.add(new Manga(10L, "Dragon ball Z", 20.5, 0));

        mangas.add(new Manga(10L, "Dragon ball Z", 20.5, 0)); //Ao duplicar itens no HashSet apenas 1 item é demonstrado

        //Usando o Set só consigo realizar o print percorrendo os itens da lista
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
