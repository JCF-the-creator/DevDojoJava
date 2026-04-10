package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.javacore.YColection.Dominio.Manga;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.99));
        mangas.add(new Manga(1L, "Berserk", 29.99));
        mangas.add(new Manga(6L, "Attack on titan", 9.99));
        mangas.add(new Manga(8L, "Pokemon", 15.9));
        mangas.add(new Manga(10L, "Dragon ball Z", 20.5));

        Collections.sort(mangas);

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Dragon ball Z", 2.99);
        System.out.println(); //mostra o indice na lista começando do 0
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

        
    }
}
