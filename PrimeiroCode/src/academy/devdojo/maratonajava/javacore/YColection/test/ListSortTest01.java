package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Hellsing Ultimate");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Dragon ball Z");

        Collections.sort(mangas); //sort verifica os itens da lista, se uma String organiza a lista por ordem alfabética, int/double por ordem numérica do menor para maior 

        for(String manga : mangas){
            System.out.println(manga);
        }
    }
}
