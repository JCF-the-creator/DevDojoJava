package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        
        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive 2", "TV", 12, "Ação");
        anime.imprime();
        // ele considera o segundo init por estar setando a variavel por ultimo
    }
}
