package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.YColection.Dominio.Manga;

//comparator faz uma comparar em um ponto especifico do software

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}


public class MangaSortTest01 {
    public static void main(String[] args) {

        //O .sort só funciona se houver .compareTo, nesse caso sendo informado na classe Manga, onde tem o "implements Comparable<Manga>" onde compara as informações
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.99));
        mangas.add(new Manga(1L, "Berserk", 29.99));
        mangas.add(new Manga(6L, "Attack on titan", 9.99));
        mangas.add(new Manga(8L, "Pokemon", 15.9));
        mangas.add(new Manga(10L, "Dragon ball Z", 20.5));

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-------------------------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator()); // mesma forma acima 
        System.out.println("-------------------------");
        for(Manga manga : mangas){
            System.out.println(manga);
        }

    }
} 