package academy.devdojo.maratonajava.javacore.FModificadorEstatico.test;

import academy.devdojo.maratonajava.javacore.FModificadorEstatico.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("OP");
        Anime anime2 = new Anime("HxH");
        Anime anime3 = new Anime("FMA");

        System.out.println(anime1.getNome());
        for (int episodios:anime1.getEpisodios()){
            System.out.println(episodios+" ");
        }
        System.out.println(anime2.getNome());
        for (int episodios:anime2.getEpisodios()){
            System.out.println(episodios+" ");
        }
        System.out.println(anime3.getNome());
        for (int episodios:anime3.getEpisodios()){
            System.out.println(episodios+" ");
        }
    }
}
