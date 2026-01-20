package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV",12,"Acao", "Production IG");
        Anime anime2 = new Anime();

        anime.imprime();
        System.out.println("----Fora do Construtor--------");
        anime2.imprime();
    }
}
