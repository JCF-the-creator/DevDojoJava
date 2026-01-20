package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        
        estudante01.nome = "Luffy";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Nami";
        estudante02.idade = 19;
        estudante02.sexo = 'F';
        
        estudante01.impreme();
        estudante02.impreme();

    }
}
