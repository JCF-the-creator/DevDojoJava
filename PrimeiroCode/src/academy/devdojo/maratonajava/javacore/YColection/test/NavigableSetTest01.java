package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.maratonajava.javacore.YColection.Dominio.Manga;
import academy.devdojo.maratonajava.javacore.YColection.Dominio.Smartphone;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        
        return o1.getMarca().compareTo(o2.getMarca());
    }
    
}


public class NavigableSetTest01 {
    public static void main(String[] args) {
        // adiciona metodos para pegar elemesntos em posição já existente 
        NavigableSet <Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        
        //Utiliza o TreeSet quando a classe implementa um comparator 

        // TreeSet organiza a lista de acordo com o CompareTo da Classe 'Manga', tambem retira as duplicadas
        NavigableSet <Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.99, 0));
        mangas.add(new Manga(1L, "Berserk", 29.99, 5));
        mangas.add(new Manga(6L, "Attack on titan", 9.99, 0));
        mangas.add(new Manga(8L, "Pokemon", 15.9,2));
        mangas.add(new Manga(10L, "Dragon ball Z", 20.5, 0));
        mangas.add(new Manga(9L, "Aaragon", 20.5, 0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
