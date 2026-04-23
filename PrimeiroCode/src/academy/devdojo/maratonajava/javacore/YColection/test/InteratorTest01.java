package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.YColection.Dominio.Manga;

public class InteratorTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new LinkedList<>();//LinkedList é um array que sabe sua posição, a proxima e a anterior, tendo uma permoface melhor para retirada de itens
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.99, 0));
        mangas.add(new Manga(1L, "Berserk", 29.99, 5));
        mangas.add(new Manga(6L, "Attack on titan", 9.99, 0));
        mangas.add(new Manga(8L, "Pokemon", 15.9, 2));
        mangas.add(new Manga(10L, "Dragon ball Z", 20.5, 0));

        /*Iterator<Manga> mangaIterator = mangas.iterator();// ele verifica todos os itens da fila 

        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade()==0) {
                mangaIterator.remove();
            }
        }
        */ //assim era feito a maneira de remover itens de uma lista na versao legado

        mangas.removeIf(denomeAumObjeto -> denomeAumObjeto.getQuantidade() == 0); //essa linha é um resumo das linhas acimas
        System.out.println(mangas);
    }
}
