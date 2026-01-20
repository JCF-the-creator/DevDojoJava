package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import academy.devdojo.maratonajava.javacore.GAssociacao.Dominio.Jogador;
import academy.devdojo.maratonajava.javacore.GAssociacao.Dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Selecao Brasileira");
        
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
