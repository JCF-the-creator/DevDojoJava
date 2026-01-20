package academy.devdojo.maratonajava.javacore.EBlocosDeInicializacao.test;

import academy.devdojo.maratonajava.javacore.EBlocosDeInicializacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        // com esse "for" ele faz o print dos episodios
        System.out.println(anime.getNome());
        for (int episodios:anime.getEpisodios()){
            System.out.println(episodios+" ");
        }

    }
}
